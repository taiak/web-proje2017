package com.proje.query;

import com.proje.query.Searchable;
import com.utilities.query.Selector;

public class AdayMusteri extends Searchable {
	public AdayMusteri() {
		super(Selector.AdayMusteriTableName);
	}
	
	public boolean onayla(int no) {
		return (this.ss.adayOnayla(no) != 0)? true: false;
	}
}
