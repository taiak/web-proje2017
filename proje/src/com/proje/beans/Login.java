package com.proje.beans;

import java.io.Serializable;

public class Login implements Serializable {

	  private String name = "Nan";
	  private String password = "Nan";

	  public Login() {
	  }

	  public String getName(){
	    return name;
	  }

	  public void setName(String  Name){
	    this.name = Name;
	  }

	  public String getPassword(){
	    return password;
	  }

	  public void setPassword(String  Password){
	    this.password = Password;
	  }
}