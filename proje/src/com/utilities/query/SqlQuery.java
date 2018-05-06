package com.utilities.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
		where = where.split(" ")[0];
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
	
	public boolean ekle(String table, ArrayList<String> set) {
		table = table.split(" ")[0];
		boolean status = false;
		try {
			String query = "INSERT INTO " + table + " VALUES( ";
			int size = set.size();
			for(int i = 0; i < size; i++) {
				query += set.get(i);
				if (size > i + 1)
					query +=  ",";
			}
			query += ") ;";
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
