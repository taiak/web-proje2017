package com.proje.beans;

import java.io.Serializable;

public class Payment implements Serializable {
	private static final long serialVersionUID = -186971185286674149L;
	private String no = "Nan";
	  private String name = "Nan";
	  private String comment = "No comment";
	  public Payment() {
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
	  
	  public String getComment(){
	    return comment;
	  }
	  
	  public void setComment(String  Comment){
	    this.comment = Comment;
	  }
}
