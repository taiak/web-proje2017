package com.crud.generalized;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utilities.query.Selector;
import com.utilities.query.SqlQuery;

@WebServlet("/guncelle")
public class Guncelle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Guncelle() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no     = request.getParameter("no");
		String adi    = request.getParameter("adi");
		String soyadi = request.getParameter("soyadi");
		String email  = request.getParameter("email");
		String table   = request.getParameter("table");
		table = Selector.table_selector(table);
		try {
			SqlQuery ss  = new SqlQuery();
			String sett  = "adi='" + adi + "', soyadi='" + soyadi + "', email='" + email +"'";
			String where = Selector.where_selector(table) + " = " + no ;
			System.out.println("table: " + Selector.where_selector(table));
			System.out.println("no: " + no);
			System.out.println("where: " + where);
			
			ss.guncelle(table, sett, where );			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
