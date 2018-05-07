package com.login.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.login.servlet.SafeLogin;

@WebServlet(asyncSupported = true, urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
    
    private static String userSuccess = "/proje/userLogin.jsp";
    private static String userUnsuccess = "/proje/deneme.jsp";
    
    private static String adminSuccess = "/proje/MainPanel";
    private static String adminUnsucces = "/proje/deneme.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 
		try {
			SafeLogin s = new SafeLogin();
            String u, p, t;

            u = request.getParameter("userName");
            p = request.getParameter("password");
            t = request.getParameter("type");
            System.out.println("t : " + t);
            
            if (t.equals("admin")) {
            	adminGirisi(response, s.adminKontrol(u, p));
            } else if(t.equals("user")) {
            	kullaniciGirisi(response, s.kullaniciKontrol(u, p));
		    }
        
        } catch (Exception e) {
        	System.out.println(e);
        }
	}
	
    private static void kullaniciGirisi(HttpServletResponse response, Boolean state) throws IOException {
    	response.sendRedirect((state)? userSuccess : userUnsuccess);
    }
    
    private static void adminGirisi(HttpServletResponse response, Boolean state) throws IOException {
    	response.sendRedirect((state)? adminSuccess : adminUnsucces);
    }
}
