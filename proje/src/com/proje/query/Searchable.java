package com.proje.query;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.utilities.query.Selector;
import com.utilities.query.SqlQuery;

public class Searchable {
	SqlQuery ss = new SqlQuery();
	String table = "NaN";
	String whereTableName = "NaN";
	public ArrayList<String> columnNames = null;
	public ArrayList<ArrayList<String>> list = null;
	public int columnNumber = 0;
	
	public Searchable(String table) {
		this.table = Selector.table_selector(table);
		this.whereTableName = Selector.where_selector(table);
		setColumnNames();
	}
	
	public void setColumnNames() {
		list = ss.listele(table);
		columnNames  = ss.columnNames;
		columnNumber = ss.columnNumber;		
	}
	
	public void listele() {
		list = ss.listele(table);
	}
	
	public void listele(int no) {
		list = ss.listele(table, where(no));
	}
	
	public boolean sil(int no) {
		return ss.sil(table, where(no));
	}
	
	public boolean ekle(ArrayList<String> set) {
		return ss.ekle(table, set);
	}
	
	public boolean guncelle(String set, int no) {
		return ss.guncelle(table, set, where(no));
	}
	
	public boolean guncelle(HttpServletRequest req, String where) throws Exception {
		return ss.guncelle(req,  this.columnNames, this.table, this.where(where));	
	}
	
	private String where(int no) {
		return whereTableName + " = " + String.valueOf(no);
	}
	
	private String where(String w) {
		return whereTableName + " = '" + w + "'";
	}
}
