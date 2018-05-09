package com.proje.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.proje.beans.Payment;
import com.proje.beans.Payment;
import com.utilities.query.DatabaseOpener;

public class PaymentDao {
	private static final String TableName = "Payment";
	
	protected static Connection connectionOpen() {
		return DatabaseOpener.open();
	}

	protected static void connectionClose(ResultSet rs, PreparedStatement ps, Connection con) {
	    try { rs.close();  } catch (Exception e) { /* ignored */ }
	    try { ps.close();  } catch (Exception e) { /* ignored */ }
	    try { con.close(); } catch (Exception e) { /* ignored */ }
	}	
	
	public static ArrayList <Payment> list(){
		ArrayList <Payment> l = new ArrayList <Payment>();
		String query = "SELECT * FROM " + TableName + ";";
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			con = connectionOpen();	
			ps = (PreparedStatement	) con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Payment p = new Payment();
				p.setNo(rs.getString("no"));
				p.setName(rs.getString("name"));
				p.setComment(rs.getString("comment"));
				l.add(p);
			}
		} catch (Exception e){
			System.out.println("db: Listing error!");
		} finally {
			connectionClose(rs, ps, con);
		}
		
		return l;
	};
	
	public static Payment find(String no){
		Payment p = new Payment();
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		String where = "no = '" + no + "'";
		String query = "SELECT * FROM " + TableName + " WHERE " + where + " ;";

		try {
			con = connectionOpen();	
			ps = (PreparedStatement	) con.prepareStatement(query);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				p.setNo(rs.getString("no"));
				p.setName(rs.getString("name"));
				p.setComment(rs.getString("comment"));
			}
		} catch (Exception e){
			System.out.println("db: finding error!");
		} finally {
			connectionClose(rs, ps, con);
		}
		
		return p;
	};
}
