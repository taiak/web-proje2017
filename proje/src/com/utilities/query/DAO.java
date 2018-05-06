package com.utilities.query;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	private static String dbUsername = "projeci";
	private static String dbPassword = "nahsanabaklava.0";
	private static String dbName = "PROJE";
	private static String dbUrl = "jdbc:mysql://localhost:3306/";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	
	public static Connection open() {
		return open(dbUsername, dbPassword, dbName, dbUrl);
	}
	
	public static Connection open(String dbUsername, String dbPassword) {
		return open(dbUsername, dbPassword, dbUrl, dbName);
	}
	
	public static Connection open(String dbUsername, String dbPassword, String dbName) {
		return open(dbUsername, dbPassword, dbName, dbUrl);
	}
	
	public static Connection open(String dbUsername, String dbPassword, String dbName, String dbUrl) {
		Connection con = null;
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(dbUrl + dbName , dbUsername, dbPassword);            
			System.out.println("Connection established for SQL");
		} catch(Exception e) {
			// bu yorum olarak kalacak!
			// System.out.println("Database connection exception=" + e);
			System.out.println("Data base Connection Error!\n" + dbUrl + dbName);
		}        
		return con;
	}
}
