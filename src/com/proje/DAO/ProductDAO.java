package com.proje.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.proje.model.Product;
import com.proje.utilities.DatabaseOpener;

public class ProductDAO {
	
	private static final String TableName = "Product";
	
	public ProductDAO() {
	}
	
	protected static Connection connectionOpen() {
		return DatabaseOpener.open();
	}

	protected static void connectionClose(ResultSet rs, PreparedStatement ps, Connection con) {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}	
	
	public static ArrayList <Product> list(String Where) {
		ArrayList <Product> l = new ArrayList <Product>();
		String where = "";
		if( Where != null && ! Where.isEmpty())
			where = Where ;
		
		String query = "SELECT * FROM " + TableName + where + ";";
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			con = connectionOpen();	
			ps = (PreparedStatement	) con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Product p = new Product();
				p.setNo(rs.getString("no"));
				p.setName(rs.getString("name"));
				p.setStock(rs.getString("stock"));
				p.setPrice(rs.getString("price"));
				p.setPhoto(rs.getString("photo"));
				p.setComment(rs.getString("comment"));
				l.add(p);
			}	
		} catch (Exception e){
			System.out.println(e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return l;
	};
	
	public static ArrayList <Product> list() {
		return list(null);
	}
	
	public static ArrayList <Product> last(int n) {
		String where = " ORDER BY no DESC LIMIT " + Integer.toString(n);
		return list(where);
	};
	
	public static Product find(String no){
		System.out.println(no);
		String where = " WHERE no = '" + no + "'";
		return list(where).get(0);
	};
	
	public static boolean delete(Product p) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "no = " + p.getNo();
		String query = "DELETE FROM " + TableName + " WHERE " + where + " ;";
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println(e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	};
	
	public static boolean update(Product p) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "no = '" + p.getNo() + "' ";
		System.out.println(where);
		String set = "name = '" + p.getName() + "', stock = '" + 
					p.getStock() + "', price = '" + p.getPrice() + "', photo = '" +
					p.getPhoto() + "', comment = '" + p.getComment() + "'";
		String query = "UPDATE " + TableName + " SET " + set + " WHERE " + where + ";";
		System.out.println(query);
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("DB: Update error!" + e);			
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	};
	
	public static boolean add(Product p) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String values = "(0, '" + p.getName() + "', '" + p.getStock() + "', '" +
					p.getPrice() + "', '" + p.getPhoto() + "', '" +
					p.getComment() + "');";
		String query = "INSERT INTO " + TableName + " VALUES " + values;
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e) {
			System.out.println("DB: Add error!");			
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	};
}
