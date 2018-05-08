package com.proje.beans;

import java.io.Serializable;

public class Musteri implements Serializable {
	
	private static final long serialVersionUID = -5808632497875834075L;
	private String soyadi = "NaN";
	private String email  = "NaN";
	private String adi    = "NaN";
	private String no     = "NaN";
	
	public Musteri() {
		
	}
	
	public String getNo() {
		return(no);
	}
	
	public void setNo(String newNo) {
		no = newNo;
	}
	
	public String getAdi() {
		return(adi);
	}
	
	public void setAdi(String newAdi) {
		adi = newAdi;
	}
	
	public String getSoyadi() {
		return(soyadi);
	}
	
	public void setSoyadi(String newSoyadi) {
		soyadi = newSoyadi;
	}
	
	public String getEmail() {
		return(email);
	}
	
	public void setEmail(String newEmail) {
		soyadi = newEmail;
	}
}
