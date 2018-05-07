package com.utilities.query;

public class Selector {
	public static final String AdayMusteriTableName = "AdayMusteri";
	public static final String SiparisTableName     = "Siparis";
	public static final String MusteriTableName     = "Musteri";
	public static final String UrunTableName        = "Urun";
	public static final String NoTable              = "no_table";
	
	private static final String AdayMusteriTableWhere = "no";
	private static final String SiparisTableWhere     = "no";
	private static final String MusteriTableWhere     = "no";
	private static final String UrunTableWhere        = "no";
	private static final String NoTableWhere          = "no_table";

	public static final String AdayMusteriDowncase = "adaymusteri";
	public static final String SiparisDowncase     = "siparis";
	public static final String MusteriDowncase     = "musteri";
	public static final String UrunDowncase        = "urun";
	
	public static final String UpdatePage = "guncelle";
	public static final String DeletePage = "sil";
	public static final String InsertPage = "";
	
	public static String table_selector(String table) {
		
		switch(table.toLowerCase()) {
		case AdayMusteriDowncase: table = AdayMusteriTableName;
			break;
		case SiparisDowncase:     table = SiparisTableName;
			break;
		case MusteriDowncase:     table = MusteriTableName;
			break;
		case UrunDowncase:        table = UrunTableName;
			break;
		default:                  table = NoTable;
			break;
		}
		return table;
	}

	public static String where_selector(String table) {
		String where = null;
		
		switch(table.toLowerCase()) {
		case AdayMusteriDowncase: where = AdayMusteriTableWhere;
		break;
		case SiparisDowncase:     where = SiparisTableWhere;
		break;
		case MusteriDowncase:     where = MusteriTableWhere;
		break;
		case UrunDowncase:        where = UrunTableWhere;
			break;
		default:                  where = NoTableWhere;
			break;
		}
		
		return where;
	}
}
