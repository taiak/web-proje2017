package com.adminpanel.index;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.query.Urunler;


@WebServlet("/UrunListele")
public class UrunListele extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UrunListele() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 
		try {
	        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Urun Listele</title>"
            		+ "<script>"
            		+ "function f(n, type){\n"
            		+ "    document.getElementById(\"form\" + n).action = type;"
            		+ "    return true;\n"
            		+ "}"
            		+ "</script>"
            		+ "</head>");
            out.println("<body>");
            
            Urunler m = new Urunler();

            int form_num = 1;
            for (ArrayList<String> e : m.list) {
            	out.printf("<form action=\"guncelle\" method=\"post\" id=\"form" + form_num + "\">");
            	for(int i = 0; i < m.columnNumber; i++) {
            		out.printf("<input type=\"text\" name=\"" + m.columnNames.get(i) +"\"" +
            				   "value=\"" + e.get(i) + "\"/>");
            	}
    			out.printf("<button onclick=\"return f(" + form_num + ", 'guncelle' );\">update</button>");
    			out.printf("<button onclick=\"return f(" + form_num + ", 'login');\">yenile</button>");
    			out.printf("</form>");
            	form_num++;
    		}
        } catch (Exception e) {
        	System.out.println(e);
        }
	}
}

