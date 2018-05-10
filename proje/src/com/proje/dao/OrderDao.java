package com.proje.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.proje.beans.Customer;
import com.proje.beans.Order;
import com.proje.beans.Product;
import com.utilities.query.DatabaseOpener;
import com.proje.dao.ProductDao;
import com.proje.dao.CustomerDao;

public class OrderDao {
	
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
	
	
	public static int count(int userId) {
		int sql_response = 0;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String query = "SELECT COUNT(*) FROM " + TableName + " WHERE customer_no = " + Integer.toString(userId) + " ;";
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeQuery();
			sql_response = ((ResultSet) ps).getInt(1);
		} catch (Exception e){
			System.out.println("db: order count error!\n" + e);
		} finally {
			connectionClose(rs, ps, con);
		}
		System.out.println("OrerDao.count: " + sql_response);
		return sql_response;
		
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
			Customer c = null;
			while(rs.next()) {
				Order o = new Order();
				o.setOrderNo(rs.getString("order_no"));
				o.setCustomerNo(rs.getString("customer_no"));
				o.setProductNo(rs.getString("product_no"));
				o.setOrderDate(rs.getString("order_date"));
				o.setPaymentNo(rs.getString("payment_no"));
				o.setPaymentName(PaymentDao.find(o.getPaymentNo()).getName());
				o.setProductName(ProductDao.find(o.getProductNo()).getName());
				c = CustomerDao.find(o.getCustomerNo());
				o.setCustomerName(c.getName());
				o.setCustomerSurname(c.getSurname());
				o.setCustomerEmail(c.getEmail());
				
				l.add(o);
			}	
		} catch (Exception e){
			System.out.println("db: listing error!");
			System.out.println("db: herhangi bişe olmuş olabilir. buraya ben bakmıyorum...\n"  +e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return l;
	};
	
	public static boolean delete(Order o) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "order_no = " + o.getOrderNo();
		String query = "DELETE FROM " + TableName + " WHERE " + where + " ;";
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("db: remove error!\n" + e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	};
	
	public static boolean update(Order o) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "order_no = '" + o.getOrderNo() + "' ";
		String set = " customer_no = '" + o.getCustomerNo() +
		     "', product_no = '" + o.getProductNo() +
		     "', order_date = '" + o.getOrderDate() +
		     "', payment_no = '" + o.getPaymentNo() + "'" ;
		
		String query = "UPDATE " + TableName + " SET " + set + " WHERE " + where + " ;";
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("db: Update error!\n" + e);
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
				"', '" + o.getOrderDate() + "', '" + o.getPaymentNo() +"');";
		String query = "INSERT INTO " + TableName + " VALUES " + values;
		System.out.println(query);
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e) {
			System.out.println("db: Add error!\n" + e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	}

	public static ArrayList<Order> getOrderByUserId(int userId) {
		ArrayList <Order> l = new ArrayList <Order>();
		String query = "SELECT * FROM " + TableName + " where customer_no = " + Integer.toString(userId) + " ;";
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			con = connectionOpen();	
			ps = (PreparedStatement	) con.prepareStatement(query);
			rs = ps.executeQuery();
			Customer c = null;
			while(rs.next()) {
				Order o = new Order();
				o.setOrderNo(rs.getString("order_no"));
				o.setCustomerNo(rs.getString("customer_no"));
				o.setProductNo(rs.getString("product_no"));
				o.setOrderDate(rs.getString("order_date"));
				o.setPaymentNo(rs.getString("payment_no"));
				o.setPaymentName(PaymentDao.find(o.getPaymentNo()).getName());
				o.setProductName(ProductDao.find(o.getProductNo()).getName());
				c = CustomerDao.find(o.getCustomerNo());
				o.setCustomerName(c.getName());
				o.setCustomerSurname(c.getSurname());
				o.setCustomerEmail(c.getEmail());
				
				l.add(o);
			}	
		} catch (Exception e){
			System.out.println("db: listing error!");
			System.out.println("db: herhangi bişe olmuş olabilir. buraya ben bakmıyorum...\n" + e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return l;
	}


}
