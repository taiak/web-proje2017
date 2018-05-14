 package com.proje.controller.main;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.DAO.CustomerDAO;
import com.proje.model.Customer;

@WebServlet("/CustomerServlet")
public class CustomerController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public HttpServletRequest request;
    public HttpServletResponse response;
    
    public CustomerController(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = com.proje.controller.login.LoginController.session;
        
        if (session != null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("user");
            dispatcher.forward(request, response);
            return;
        }
        String toDo = request.getParameter("toDo");
        if(toDo.equals("register")) {
            Customer customer = new Customer();
            customer.setEmail(String.valueOf(request.getParameter("email")));
            customer.setName(String.valueOf(request.getParameter("name")));
            customer.setSurname(String.valueOf(request.getParameter("surname")));
            customer.setHashedPassword(String.valueOf(request.getParameter("password_plain")));
            CustomerDAO.add(customer);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("login");
            dispatcher.forward(request, response);
        }
    }


    public void index() throws ServletException, IOException {
        if (com.proje.controller.login.LoginController.session != null && !com.proje.controller.login.LoginController.session.getAttribute("user_id").equals("Nan")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login");
            dispatcher.forward(request, response);
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("newCustomer.jsp");
            dispatcher.forward(request, response);
        }
    }
    
}