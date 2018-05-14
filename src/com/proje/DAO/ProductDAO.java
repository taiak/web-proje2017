package com.proje.DAO;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.proje.model.Product;

public class ProductDAO extends DAO {
	
	private static final String TableName = "Product";
	
	public ProductDAO() {
	}
	
	public static ArrayList <Product> list(String Where) {
		ArrayList <Product> l = new ArrayList <Product>();
		String where = "";
		if( Where != null && ! Where.isEmpty())
			where = Where ;
		
		String query = "SELECT * FROM " + TableName + where + ";";

		try {
			con = connectionOpen();	
			ps = (PreparedStatement) con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Product p = new Product();
				p.setNo(rs.getString("no"));
				p.setName(rs.getString("name"));
				p.setStock(rs.getString("stock"));
				p.setPrice(rs.getString("price"));
				p.setPhoto(rs.getString("photo"));
				p.setComment(rs.getString("comment"));
				l.add(p);
			}	
		} catch (Exception e){
			System.out.println(e);
		} finally {
			connectionClose(rs, ps, con);
		}
		return l;
	};
	
	public static ArrayList <Product> list() {
		return list(null);
	}
	
	public static ArrayList <Product> last(int n) {
		String where = " ORDER BY no DESC LIMIT " + Integer.toString(n);
		return list(where);
	};
	
	public static Product find(String no){
		System.out.println(no);
		String where = " WHERE no = '" + no + "'";
		return list(where).get(0);
	};
	
	public static boolean delete(Product p) {
		String where = "no = " + p.getNo();
		String query = "DELETE FROM " + TableName + " WHERE " + where + " ;";
		return execute(query,"Delete");
	};
	
	public static boolean update(Product p) {
		String where = "no = '" + p.getNo() + "' ";
		String set = "name = '" + p.getName() + "', stock = '" + 
					p.getStock() + "', price = '" + p.getPrice() + "', photo = '" +
					p.getPhoto() + "', comment = '" + p.getComment() + "'";
		String query = "UPDATE " + TableName + " SET " + set + " WHERE " + where + ";";
		return execute(query, "Update");
	};
	
	public static boolean add(Product p) {
		String values = "(0, '" + p.getName() + "', '" + p.getStock() + "', '" +
					p.getPrice() + "', '" + p.getPhoto() + "', '" +
					p.getComment() + "')";
		String query = "INSERT INTO " + TableName + " VALUES " + values + ";";
		return execute(query, "add");
	};
}
