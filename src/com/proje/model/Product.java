package com.proje.model;

import java.io.Serializable;

public class Product implements Serializable {
	
	private static final long serialVersionUID = 7385311327272592031L;
	private String no      = "NaN";
	private String name    = "NaN";
	private String stock   = "0";
	private String price   = "0";
	private String photo   = "No photo";
	private String comment = "No Comment";

	public Product() {		
		
	}
	
	public String getNo(){
	    return no;
	  }

	public void setNo(String  No){
	    this.no = No;
	  }

	public String getName(){
	    return name;
	  }

	public void setName(String  Name){
	    this.name = Name;
	  }

	public String getStock(){
	    return stock;
	  }

	public void setStock(String  Stock){
	    this.stock = Stock;
	  }

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
