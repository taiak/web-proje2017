package com.adminpanel.index;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminPanel")
public class AdminPanel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminPanel() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 
		try {
			response.setContentType("text/html");
			
	        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Main Panel</title></head>");
            out.println("<body>");
            
            
            // link, button adı şeklinde itiyoruz
            
            String [] str = {"siparisler" , "Siparis",
                             "urunlistele", "Urunler",
                             "musteriler","Musteriler",
                             "adaymusteriler", "Aday Musteriler"
                             };
            
            ArrayList <String> menu = new ArrayList<>(Arrays.asList(str));
            
            int count = menu.size();
            for (int n = 0; n < count; n++) {
            	out.printf("<form action=\"" + menu.get(n) +"\" method=\"post\">");
            	out.printf("<button type=\"submit\">" + menu.get(++n) + "</button>");
    			out.printf("</form>");
            }
            
        } catch (Exception e) {
        	System.out.println(e);
        }
	}
}
