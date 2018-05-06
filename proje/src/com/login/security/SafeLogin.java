package com.login.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import com.utilities.query.DAO;


public class SafeLogin {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public SafeLogin(){
	}
	
	private void connectionOpen() {
		con = DAO.open();
	}
	
	private static String getSha256(String value) {
	    try{
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        md.update(value.getBytes());
	        return bytesToHex(md.digest());
	    } catch(Exception ex){
	        throw new RuntimeException(ex);
	    }
	 }
	
	 private static String bytesToHex(byte[] bytes) {
	    StringBuffer result = new StringBuffer();
	    for (byte b : bytes) result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
	    return result.toString();
	}
	 
	private void connectionClose() {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}
	
	public boolean adminKontrol(String name, String password) {
		boolean state = false;
		
		try {
			int temp_val = 2;
			connectionOpen();
			ps = (PreparedStatement) con.prepareStatement("CALL adminControl('" + getSha256(name) + "', '" + getSha256(password) + "');");
			rs = ps.executeQuery();
			if(rs.next()) {
				temp_val = Integer.parseInt(rs.getString("sonuc"));
			}
			state = (temp_val == 1) ? true : false ;
		} catch (Exception e) {
			System.err.println("Admin kontrolü sırasında hatayla karşılaşıldı!");
		} finally {
		    connectionClose();
		}
		return state;
	}
	
	public boolean kullaniciKontrol(String email, String password) throws NoSuchAlgorithmException {
		boolean state = false;
		try {
			int temp_val = 2;
			connectionOpen();
			ps = (PreparedStatement) con.prepareStatement("CALL userControl('" + email + "', '" + getSha256(password) + "');");
			rs = ps.executeQuery();
			if(rs.next()) {
				temp_val = Integer.parseInt(rs.getString("sonuc"));
			}
			state = (temp_val == 1) ? true : false ;
		} catch (Exception e) {
			System.err.println("Kullanici kontrolü sırasında hatayla karşılaşıldı!");
		} finally {
		    connectionClose();
		}	
		return state;
	}
}