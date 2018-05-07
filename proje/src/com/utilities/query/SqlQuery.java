package com.utilities.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.utilities.query.DAO;

public class SqlQuery {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
    public  int columnNumber;
	public ArrayList<String> columnNames;
	
	public SqlQuery() {
	}
	
	private void connectionOpen() {
		con = DAO.open();
	}

	private void connectionClose() {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}	
	
	private ArrayList<ArrayList<String>> sorgula(String query) {
		ArrayList<ArrayList<String>> elements = new ArrayList<ArrayList<String>>();
		try {
			connectionOpen();
			ps = (PreparedStatement	) con.prepareStatement(query);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			columnNumber = rsmd.getColumnCount();
			columnNames = new ArrayList<String>();
			
			for(int i = 1; i <= columnNumber; i++) {
				columnNames.add(rsmd.getColumnName(i));
			}
			
			while(rs.next()) {
				ArrayList<String> e = new ArrayList<String>();
				for(int i = 1; i <= columnNumber; i++) {
					e.add(rs.getString(i));
				}
				elements.add(e);
			}
		} catch (Exception e) {
			System.err.println("Sorgulama sırasında hatayla karşılaşıldı!");
		} finally {
		    connectionClose();
		}
		
		return elements;
	}

	public ArrayList<ArrayList<String>> listele(String table) {
		table = table.split(" ")[0];
		String query = "SELECT * FROM " + table + ";";
		return sorgula(query);
	}
			
	public ArrayList<ArrayList<String>> listele(String table, String where) {
		table = table.split(" ")[0];
		where = where.split(" ")[0];
		String query = "SELECT * FROM " + table + " WHERE " + where + ";";
		return sorgula(query);
	}
		
	//String table, String where, Map<String,String> set
	public boolean guncelle(String table, String set, String where) {
		boolean status = false;
		table = table.split(" ")[0];
		String query = "UPDATE " + table + " SET " + set + " WHERE " + where + " ;";
		
		try {
			connectionOpen();
			System.out.println("içerik: " + query);
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			status = true;
		} catch (Exception e) {
			System.err.println("Guncelleme sirasinda hatayla karsilasildi!!");
		} finally {
		    connectionClose();
		}
		return status;
	}

	public boolean guncelle(HttpServletRequest request, ArrayList<String> columnNames, String table, String where) throws Exception {
		String set = makeSet(request, columnNames);
		return this.guncelle(table, set, where);
	}
	
	private String makeSet(HttpServletRequest request, ArrayList<String> columnNames) throws Exception {
		String sett = "";
		String v = null;
		int count = columnNames.size();
		
		for(int i = 0; i < count; i++) 
		{
			v = request.getParameter(columnNames.get(i));
			sett += columnNames.get(i) + "='" + v + "'";
			
			if(count > i + 1)
				sett += ", ";
		}
		
		return sett;
	}
	
	private String seperateRequest(HttpServletRequest request, ArrayList<String> columnNames) throws Exception {
		String sett = "";
		
		int count = columnNames.size();
		
		for(int i = 0; i < count; i++) {
			sett += request.getParameter(columnNames.get(i));
			
			if(count > i + 1)
				sett += ", ";
		}
		return sett;
	}
	
	private String makeSet(ArrayList<String> values) throws Exception {
		String sett = "";
		int count = values.size();
		for(int i = 0; i < count; i++) {
			sett += values.get(i);
			if(count > i + 1)
				sett += ", ";
		}
		return sett;
	}	
	
	public boolean ekle(String table, String tableNames, String set) {
		table = table.split(" ")[0];
		
		if(tableNames != null)
			tableNames = "(" + tableNames + ")";
		else
			tableNames = "";
		
		boolean status = false;
		try {
			String query = "INSERT INTO " + table + tableNames + " VALUES( " + set + ") ;";
			connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			status = true;
		} catch (Exception e) {
			System.err.println("Yukleme sirasinda hatayla karsilasildi!!");
		} finally {
		    connectionClose();
		}
		
		return status;
	}
	
	public boolean ekle(String table, String set) {
		return ekle(table, null, set);
	}
	
	public boolean ekle(String table, ArrayList<String> set) throws Exception {
		return ekle(table, null, this.makeSet(set));
	}
	
	public boolean ekle(String table, HttpServletRequest request, ArrayList<String> columnNames) throws Exception {
		String tableNames = seperateRequest(request, columnNames);
		String set = this.makeSet(columnNames);
		return this.ekle(table, tableNames, set);
	}
	
	public boolean sil(String table, String where) {
		boolean status = false;
		table = table.split(" ")[0];
		String query = "DELETE FROM " + table + " WHERE " + where + ";";
		
		try {
			connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			status = true;
		} catch (Exception e) {
			System.err.println("Silme sirasinda hatayla karsilasildi!!");
		} finally {
		    connectionClose();
		}
		return status;
	}
	/*
	 * 0 başarısız
	 * 1 başarılı
	 * 2 böyle bir kullanıcı yok ama işlem başarılı
	 * 
	 * */
	public int adayOnayla(int no) {
		int state = 0;
		
		try {
			connectionOpen();
			ps = (PreparedStatement) con.prepareStatement("CALL adayOnayi(" + no + ");");
			rs = ps.executeQuery();
			
			if(rs.next()) {
				state = Integer.parseInt(rs.getString("sonuc"));
			}
		} catch (Exception e) {
			System.err.println("Aday onayı sırasında bir hatayla karşılaşıldı!");
			System.err.println(e);
		} finally {
		    connectionClose();
		}
		
		return state;
	}
}
