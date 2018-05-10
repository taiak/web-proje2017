package com.proje.beans;

import java.io.Serializable;

import com.login.servlet.SafeLogin;

public class Customer implements Serializable {

	  private static final long serialVersionUID = 5801053122965558808L;
	  private String no             = "Nan";
	  private String name           = "Nan";
	  private String surname        = "Nan";
	  private String email          = "Nan";
	  private String hashedPassword = "Nan";

	  public Customer() {
		  
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

	  public String getSurname(){
	    return surname;
	  }

	  public void setSurname(String  Surname){
	    this.surname = Surname;
	  }

	  public String getEmail(){
	    return email;
	  }

	  public void setEmail(String  Email){
	    this.email = Email;
	  }

	  public String getHashedPassword() {
		return hashedPassword;
	  }
	  
	  public void setHashedPassword(String plainTextPassword) {
		this.hashedPassword = SafeLogin.getSha256(plainTextPassword);
	  }
}
