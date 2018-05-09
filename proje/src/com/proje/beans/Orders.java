package com.proje.beans;

import java.io.Serializable;

public class Orders implements Serializable {

	  private String orderNo = "Nan";
	  private String customerNo = "Nan";
	  private String productNo = "Nan";
	  private String orderDate = "Nan";
	  private String paymentNo = "Nan";

	  public Orders() {

	  }

	  public String getOrderNo(){
	    return orderNo;
	  }

	  public void setOrderNo(String  OrderNo){
	    this.orderNo = OrderNo;
	  }

	  public String getCustomerNo(){
	    return customerNo;
	  }

	  public void setCustomerNo(String  CustomerNo){
	    this.customerNo = CustomerNo;
	  }

	  public String getProductNo(){
	    return productNo;
	  }

	  public void setProductNo(String  ProductNo){
	    this.productNo = ProductNo;
	  }

	  public String getOrderDate(){
	    return orderDate;
	  }

	  public void setOrderDate(String  OrderDate){
	    this.orderDate = OrderDate;
	  }

	  public String getPaymentNo(){
	    return paymentNo;
	  }

	  public void setPaymentNo(String  PaymentNo){
	    this.paymentNo = PaymentNo;
	  }
}

