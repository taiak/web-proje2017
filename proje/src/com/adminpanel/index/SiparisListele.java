package com.adminpanel.index;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proje.query.Siparis;
import com.utilities.query.Selector;


@WebServlet("/siparisler")
public class SiparisListele extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SiparisListele() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		response.setContentType("text/html");
		listele(response);	
	}
	
	private void listele(HttpServletResponse response){
		try {            
			Siparis m = new Siparis();
			String updatePage = Selector.UpdatePage;
			String deletePage = Selector.DeletePage;
			String table = Selector.SiparisTableName;
			
	        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Urun Listele</title>"
            		+ "<script>"
            		+ "function f(n, type, table){\n"
            		+ "    id = \"form\" + n ;\n"
            		+ "    document.getElementById(id).action = type;\n"
            		+ "    input = \"<input type=\\\"hidden\\\" name=\\\"table\\\" value=\\\"\" + table + \"\\\">\";\n"
            		+ "    document.getElementById(id).insertAdjacentHTML( 'beforeend', input );\n"
            		+ "    return true;\n"
            		+ "}"
            		+ "</script>"
            		+ "</head>");
            out.println("<body>");

            int form_num = 1;
            for (ArrayList<String> e : m.list) {
            	out.printf("<form action=\"guncelle\" method=\"post\" id=\"form" + form_num + "\">");
            	for(int i = 0; i < m.columnNumber; i++) {
            		out.printf("<input type=\"text\" name=\"" + m.columnNames.get(i) +"\"" +
            				   "value=\"" + e.get(i) + "\"/>");
            	}
    			out.printf("<button onclick=\"return f(" + form_num + ", '"+ updatePage + "', '" + table + "');\">guncelle</button>");
    			out.printf("<button onclick=\"return f(" + form_num + ", '"+ deletePage + "', '" + table + "');\">sil</button>");
    			out.printf("</form>");
            	form_num++;
    		}
            out.println("</body>");
            out.println("</html>");
		} catch (Exception e) {
        	System.out.println(e);
        }
	}
}