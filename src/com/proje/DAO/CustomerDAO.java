package com.proje.DAO;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.proje.model.Customer;
import com.proje.utilities.SafeLogin;

public class CustomerDAO extends DAO{	

	private static final String TableName = "Customer";
	
	public CustomerDAO() {
	}
	
	
	public static ArrayList <Customer> list(String Where){
		String where = "";
		if( Where != null && ! Where.isEmpty())
			where = Where;
		
		String query = "SELECT * FROM " + TableName + where + ";";
		ArrayList <Customer> l = new ArrayList <Customer>();

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
		String where = "no = '" + c.getNo();
		String query = "DELETE FROM " + TableName + " WHERE " + where + "';";
		return execute(query, "Deleting");
	};
	
	public static boolean update(Customer c) {
		String where = "no = '" + c.getNo() + "' ";
		String set = "name = '" + c.getName() + "', surname = '" 
					 + c.getSurname() + "', email = '" + c.getEmail() + "'";
		String query = "UPDATE " + TableName + " SET " + set + " WHERE "+ where + " ;";
		System.out.println("----------------------------");
		if(!execute(query, "Update")) {
			System.out.println(TableName +" Update error!");
			return false;
		};
			
		// Update Password
		// if password empty, skip updating CustomerShadow
		if(c.getHashedPassword().equals(SafeLogin.getSha256(""))) {
			System.out.println("Password will not change!");
			return true;
		}
		
		query = "UPDATE CustomerShadow SET password = '" + c.getHashedPassword() + "' WHERE customer_no = '" + c.getNo() + "' ;" ;
		return execute(query, "Password Update");
	};
	
	public static boolean add(Customer c) {
		String values = "(0, '" + c.getName() + "', '" + c.getSurname() + "', '" + c.getEmail() + "') ";
		String query = "INSERT INTO " + TableName + " VALUES " + values + " ;";
		if(!execute(query, "Insert")) {
			System.out.println(TableName +" Insert error!");
			return false;
		};
		
		// Insert Password
		String where = " WHERE email = '" + c.getEmail() + "'";
		Customer tmp = list(where).get(0);
		
		query = "INSERT INTO CustomerShadow SET password = '" + c.getHashedPassword() + "', customer_no = '" + tmp.getNo() + "' ;" ;
		return execute(query, "Password Insert");
	};
	
}
