package com.crud.generalized;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.utilities.query.SqlQuery;
import com.utilities.query.Selector;

@WebServlet("/sil")
public class Sil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Sil() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no      = request.getParameter("no");
		String table   = request.getParameter("table");
		
		try {
			String where = "no = '" + no + "'";
			SqlQuery ss  = new SqlQuery();
			ss.sil(table, where);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
