package com.crud.generalized;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.query.Searchable;

@WebServlet("/gincelle")
public class Guncelle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Guncelle() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO: Çakışmaları engellemek için bütün tablolara trigger yazılacak
		String table = request.getParameter("table");
		String no    = request.getParameter("no");

		try {
			Searchable ss = new Searchable(table);
			ss.guncelle(request, no);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
