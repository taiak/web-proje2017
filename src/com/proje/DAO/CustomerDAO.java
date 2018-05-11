package com.proje.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.proje.model.Customer;
import com.proje.utilities.DatabaseOpener;

public class CustomerDAO {	

	private static final String TableName = "Customer";
	
	public CustomerDAO() {
	}
	
	protected static Connection connectionOpen() {
		return DatabaseOpener.open();
	}

	protected static void connectionClose(ResultSet rs, PreparedStatement ps, Connection con) {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}
	
	public static ArrayList <Customer> list(String Where){
		String where = "";
		if( Where != null && ! Where.isEmpty())
			where = Where;
		
		String query = "SELECT * FROM " + TableName + where + ";";
		ArrayList <Customer> l = new ArrayList <Customer>();
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
			System.out.println("db: listing error!" + e);
		} finally {
			connectionClose(rs, ps, con);
		}
		
		return l;
	};
	
	public static ArrayList <Customer> list(){
		return list(null);
	};
	
	public static Customer find(String no){
		String where = " WHERE no = '" + no + "'";
		return list(where).get(0);
	};
	
	public static String name(String no){
		return find(no).getName();
	};
	
	public static boolean delete(Customer c) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "no = '" + c.getNo() + "';";
		String query = "DELETE FROM " + TableName + " WHERE " + where;
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("db: Deleting error!" + e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	};
	
	public static boolean update(Customer c) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "no = '" + c.getNo() + "' ";
		String set = "name = '" + c.getName() + "', surname = '" 
					 + c.getSurname() + "', email = '" + c.getEmail() + "'";
		String query = "UPDATE " + TableName + " SET " + set + " WHERE "+ where + " ;";
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("db: Updating error!" + e);			
		} finally {
			connectionClose(rs, ps, con);
		}
		
		// Update Password
		query = "UPDATE CustomerShadow SET password = '" + c.getHashedPassword() + "' WHERE customer_no = '" + c.getNo() + "' ;" ;
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("db: Password Updating error!" + e);			
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
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e) {
			System.out.println("db: Inserting error!" + e);			
		} finally {
			connectionClose(rs, ps, con);
		}
		
		// Insert Password
		String where = " WHERE email = '" + c.getEmail() + "'";
		Customer tmp = list(where).get(0);
		
		query = "INSERT INTO CustomerShadow SET password = '" + c.getHashedPassword() + "', customer_no = '" + tmp.getNo() + "' ;" ;
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e){
			System.out.println("db: Password Insert error!" + e);			
		} finally {
			connectionClose(rs, ps, con);
		}
		
		
		return statu;
	};
}
