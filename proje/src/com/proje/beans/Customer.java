package com.proje.beans;

import java.io.Serializable;

public class Customer implements Serializable {

	  private String no = "Nan";
	  private String name = "Nan";
	  private String surname = "Nan";
	  private String email = "Nan";

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
}
