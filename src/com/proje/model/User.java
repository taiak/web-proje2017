package com.proje.model;

import java.io.Serializable;

public class User implements Serializable {

	  private static final long serialVersionUID = 981359077056633823L;
	  private String id = "NaN";
	  private String name = "NaN";
	  private String surname = "NaN";
	  private String email = "NaN";
	  private boolean login = false;
	  private boolean pass = false;
	  
	  public User() {
	  }

	  public String getId(){
	    return id;
	  }

	  public void setId(String  Id){
	    this.id = Id;
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

	  public boolean isLogin(){
	    return login;
	  }

	  public void setLogin(boolean Login){
	      this.login = Login;
	  }
	  
	  public void setPass(boolean Pass){
	      this.pass = Pass;
	  }

	  public boolean getPass(){
		  return pass;
	  }
}


