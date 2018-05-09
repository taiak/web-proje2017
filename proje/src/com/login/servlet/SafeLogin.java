package com.login.servlet;

import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.proje.beans.Login;
import com.proje.beans.User;
import com.utilities.query.DAO;
	
		
public class SafeLogin {
	protected static String getSha256(String value) {
	    try{
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        md.update(value.getBytes());
	        return bytesToHex(md.digest());
	    } catch(Exception ex){
	        throw new RuntimeException(ex);
	    }
	 }
	
	 protected static String bytesToHex(byte[] bytes) {
	    StringBuffer result = new StringBuffer();
	    for (byte b : bytes) 
	    	result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
	    
	    return result.toString();
	}
	
	public static boolean adminControl(Login user) {
		boolean state = false;
		Connection con = DAO.open();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String res = "NaN";
			String query = "CALL adminControl('" + user.getName() + "', '" + getSha256(user.getPassword()) + "');";
			ps = (PreparedStatement) con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				res = rs.getString("sonuc");
			}
			state = (res.equals("NaN")) ? false : true ;
		} catch (Exception e) {
			System.err.println("Admin kontrolü sırasında hatayla karşılaşıldı!");
		} finally {
		    try { rs.close();  } catch (Exception e) { /* ignored */ }
		    try { ps.close();  } catch (Exception e) { /* ignored */ }
		    try { con.close(); } catch (Exception e) { /* ignored */ }
		}
		return state;
	}
	
	public static User userControl(Login user) {
		User u = new User();
		Connection con = DAO.open();;
		PreparedStatement ps = null;
		ResultSet rs = null;
		System.out.println("User Control from database!");
		try {
			String query = "CALL userControl('" + user.getName() + "', '" + getSha256(user.getPassword()) + "');";
			ps = (PreparedStatement) con.prepareStatement(query);

			rs = ps.executeQuery();
			if(rs.next()) { // sonuç olarak bi tablo varsa
				u.setId(rs.getString("id"));
				u.setName(rs.getString("name"));
				u.setSurname(rs.getString("surname"));
				u.setEmail(rs.getString("email"));
				u.setPass((u.getName().equals("NaN")? false: true));
			}
		} catch (Exception e) {
			System.err.println("Kullanici kontrolü sırasında hatayla karşılaşıldı!");
		} finally {
		    try { rs.close();  } catch (Exception e) { /* ignored */ }
		    try { ps.close();  } catch (Exception e) { /* ignored */ }
		    try { con.close(); } catch (Exception e) { /* ignored */ }
		}
		
		return u;
	}
}
