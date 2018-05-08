package com.login.servlet;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import com.utilities.query.DAO;

@WebServlet(asyncSupported = true, urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
		
	private static final long serialVersionUID = -8764850810112370916L;

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
	
	public static boolean adminKontrol(String name, String password) {
		boolean state = false;
		Connection con = DAO.open();;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			int temp_val = 2;
			ps = (PreparedStatement) con.prepareStatement("CALL adminControl('" + getSha256(name) + "', '" + getSha256(password) + "');");
			rs = ps.executeQuery();
			if(rs.next()) {
				temp_val = Integer.parseInt(rs.getString("sonuc"));
			}
			state = (temp_val == 1) ? true : false ;
		} catch (Exception e) {
			System.err.println("Admin kontrolü sırasında hatayla karşılaşıldı!");
		} finally {
		    try { rs.close();  } catch (Exception e) { /* ignored */ }
		    try { ps.close();  } catch (Exception e) { /* ignored */ }
		    try { con.close(); } catch (Exception e) { /* ignored */ }
		}
		return state;
	}
	
	public static boolean kullaniciKontrol(String email, String password) throws NoSuchAlgorithmException {
		boolean state = false;
		Connection con = DAO.open();;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			int temp_val = 2;
			ps = (PreparedStatement) con.prepareStatement("CALL userControl('" + email + "', '" + getSha256(password) + "');");
			rs = ps.executeQuery();
			if(rs.next()) {
				temp_val = Integer.parseInt(rs.getString("sonuc"));
			}
			state = (temp_val == 1) ? true : false ;
		} catch (Exception e) {
			System.err.println("Kullanici kontrolü sırasında hatayla karşılaşıldı!");
		} finally {
		    try { rs.close();  } catch (Exception e) { /* ignored */ }
		    try { ps.close();  } catch (Exception e) { /* ignored */ }
		    try { con.close(); } catch (Exception e) { /* ignored */ }
		}	
		return state;
	}}
