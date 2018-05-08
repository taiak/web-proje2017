package com.proje.beans;

import java.io.Serializable;

public class Siparis implements Serializable {
	private static final long serialVersionUID = -3646375621510825152L;
	private String odeme_yontemi_no = "NaN";
	private String siparis_tarihi    = "NaN";
	private String urun_no           = "NaN";
	private String musteri_no        = "NaN";
	private String no                = "NaN";
	
	public Siparis() {
		
	}
	
	public String getNo() {
		return(no);
	}
	
	public void setNo(String newNo) {
		no = newNo;
	}
	
	public String getSiparisTarihi() {
		return(siparis_tarihi);
	}
	
	public void setSiparisTarihi(String newTarih) {
		siparis_tarihi = newTarih;
	}
	
	public String getUrunNo() {
		return(urun_no);
	}
	
	public void setUrunNo(String newNo) {
		urun_no = newNo;
	}
	
	public String getMusteriNo() {
		return(musteri_no);
	}
	
	public void setMusteriNo(String newNo) {
		musteri_no = newNo;
	}
	
	public String getOdemeYontemiNo() {
		return(odeme_yontemi_no);
	}
	
	public void setOdemeYontemiNo(String newNo) {
		odeme_yontemi_no = newNo;
	}
}
