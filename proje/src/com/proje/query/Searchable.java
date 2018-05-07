package com.proje.query;

import java.util.ArrayList;

import com.utilities.query.Selector;
import com.utilities.query.SqlQuery;

public class Searchable {
	SqlQuery ss = new SqlQuery();
	String table;
	String whereTableName;
	public ArrayList<String> columnNames;
	public ArrayList<ArrayList<String>> list;
	public int columnNumber;
	
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
	
	private String where(int no) {
		return whereTableName + " = " + String.valueOf(no);
	}
}
