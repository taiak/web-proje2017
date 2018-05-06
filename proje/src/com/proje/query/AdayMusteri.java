package com.proje.query;

import com.proje.query.Searchable;

public class AdayMusteri extends Searchable {
	public AdayMusteri() {
		super("AdayMusteri", "no");
	}
	
	public boolean onayla(int no) {
		return (this.ss.adayOnayla(no) != 0)? true: false;
	}
}
