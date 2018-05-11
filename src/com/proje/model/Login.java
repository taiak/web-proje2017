package com.proje.model;

import java.io.Serializable;

public class Login implements Serializable {

	private static final long serialVersionUID = 4364171940870459728L;
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
