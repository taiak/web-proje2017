package com.proje.DAO;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.proje.model.Payment;

public class PaymentDAO extends DAO{
	private static final String TableName = "Payment";
		
	public static ArrayList <Payment> list(){
		ArrayList <Payment> l = new ArrayList <Payment>();
		String query = "SELECT * FROM " + TableName + ";";

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
