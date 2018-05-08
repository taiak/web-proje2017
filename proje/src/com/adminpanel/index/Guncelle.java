package com.adminpanel.index;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no     = request.getParameter("no");
		String adi    = request.getParameter("adi");
		String soyadi = request.getParameter("soyadi");
		String email  = request.getParameter("email");
		//String type   = request.getParameter("type");
		
		try {
			String sett   = "adi='" + adi + "', soyadi='" + soyadi + "', email='" + email +"'";
			String where = "no='" + no + "'";
			SqlQuery ss  = new SqlQuery();
			ss.guncelle("Musteri", sett, where );			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
