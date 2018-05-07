package com.crud.generalized;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.query.Searchable;

@WebServlet("/Ekle")
public class Ekle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ekle() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String table = request.getParameter("table");

		try {
			Searchable ss = new Searchable(table);
			ss.ekle(request);
		} catch (Exception e) {
			System.out.println(e);
		}	
	}

}
