package com.proje.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.proje.beans.Customer;
import com.utilities.query.DatabaseOpener;

public class CustomerDao {	

	private static final String TableName = "Customer";
	
	public CustomerDao() {
	}
	
	protected static Connection connectionOpen() {
		return DatabaseOpener.open();
	}

	protected static void connectionClose(ResultSet rs, PreparedStatement ps, Connection con) {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}	
	
	public static ArrayList <Customer> list(){
		ArrayList <Customer> l = new ArrayList <Customer>();
		String query = "SELECT * FROM " + TableName + ";";
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			con = connectionOpen();	
			ps = (PreparedStatement	) con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Customer c = new Customer();
				c.setNo(rs.getString("no"));
				c.setName(rs.getString("name"));
				c.setSurname(rs.getString("surname"));
				c.setEmail(rs.getString("email"));
				l.add(c);
			}
		} catch (Exception e){
			System.out.println(e);
		} finally {
			connectionClose(rs, ps, con);
		}
		
		return l;
	};
	
	public static boolean delete(Customer c) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "email = '" + c.getEmail() + "';";
		String query = "DELETE FROM " + TableName + " WHERE " + where;
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
	
	public static boolean update(Customer c, String no) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "no = '" + no + "' ";
		String set = "name = '" + c.getName() + "', surname = '" 
					 + c.getSurname() + "' email = '" + c.getEmail() + "'";
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
	
	public static boolean add(Customer c) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String values = "(0, '" + c.getName() + "', '" + c.getSurname() + "', '" + c.getEmail() + "') ";
		String query = "INSERT INTO " + TableName + " VALUES " + values + " ;";
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
