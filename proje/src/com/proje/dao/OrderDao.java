package com.proje.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.proje.beans.Order;
import com.proje.beans.Product;
import com.utilities.query.DatabaseOpener;

public class OrderDao {	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static final String TableName = "Orders";
	
	public OrderDao() {
	}
	
	protected static Connection connectionOpen() {
		return DatabaseOpener.open();
	}

	protected static void connectionClose(ResultSet rs, PreparedStatement ps, Connection con) {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}	
	
	public static ArrayList <Order> list(){
		ArrayList <Order> l = new ArrayList <Order>();
		String query = "SELECT * FROM " + TableName + ";";
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			con = connectionOpen();	
			ps = (PreparedStatement	) con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Order o = new Order();
				o.setCustomerNo(rs.getString("customer_no"));
				o.setProductNo(rs.getString("product_no"));
				o.setOrderDate(rs.getString("order_date"));
				o.setOrderDate(rs.getString("order_date")); 
				l.add(o);
			}	
		} catch (Exception e){
			System.out.println(e);
		} finally {
			connectionClose(rs, ps, con);
		}
		
		return l;
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
			System.out.println("hata var: query" + query);
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
	
	public static boolean update(Product p, String no) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "no = '" + no + "' ";
		String set = "name = '" + p.getName() + "', stock = '" + p.getStock() + "' ";
		String query = "UPDATE " + TableName + " SET " + set + " WHERE "+ where + " ;";
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("Guncelleme basarisiz!");			
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	};
	
	public static boolean add(Order o) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String values = "(0,'" + o.getCustomerNo() + "', '" + o.getProductNo() +
				"', '" +o.getOrderDate() + "', '" + o.getPaymentNo() +"');";
		String query = "INSERT INTO " + TableName + " VALUES " + values;
		System.out.println("query: " + query);
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e) {
			System.out.println("Ekleme basarisiz!");
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	};

}
