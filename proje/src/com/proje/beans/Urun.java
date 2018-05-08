package com.proje.beans;

import java.io.Serializable;

public class Urun implements Serializable {

	private static final long serialVersionUID = -2332400590532764389L;
	private String stok_miktari = "NaN";
	private String adi          = "NaN";
	private String no           = "NaN";
	
	public Urun() {
		
	}
	
	public String getNo() {
		return(no);
	}
	
	public void setNo(String newNo) {
		no = newNo;
	}
	
	public String getStokMiktari() {
		return(stok_miktari);
	}
	
	public void setStokMiktari(String newMiktar) {
		stok_miktari = newMiktar;
	}
	
	public String getAdi() {
		return(adi);
	}
	
	public void setUrunAdi(String newAd) {
		adi = newAd;
	}
	
}
