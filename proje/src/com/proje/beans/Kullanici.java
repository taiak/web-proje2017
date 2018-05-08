package com.proje.beans;

public class Kullanici {
	private String password   = "NaN";
	private String musteri_no = "NaN";
	
	public Kullanici() {	
	}
	
	public String getPassword() {
		return(password);
	}
	
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	
	public String getMusteriNo() {
		return(musteri_no);
	}
	
	public void setMusteriNo(String newNo) {
		musteri_no = newNo;
	}	
}
