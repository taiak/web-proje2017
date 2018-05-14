package com.proje.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.proje.utilities.DatabaseOpener;

public class DAO {

	public static PreparedStatement ps = null;
	public static Connection con = null;
	public static ResultSet rs = null;
	
	public static Connection connectionOpen() {
		return DatabaseOpener.open();
	}
	
	public static void connectionClose(ResultSet rs, PreparedStatement ps, Connection con) {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}
	
	public static boolean execute(String query, String type) {
		boolean statu = false;
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = connectionOpen();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.executeUpdate();
			statu = true;
		} catch (Exception e) {
			System.out.println("DB: " + type + " error!");			
		} finally {
			connectionClose(rs, ps, con);
		}
		return statu;
	}
}
