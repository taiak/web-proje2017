package com.proje.beans;

import java.io.Serializable;

public class Product implements Serializable {


	private static final long serialVersionUID = 7385311327272592031L;
	
	  private String no = "NaN";
	  private String name = "NaN";
	  private String stock = "NaN";

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
}
