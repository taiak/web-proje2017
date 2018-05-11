 package com.proje.controller.main;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proje.DAO.OrderDAO;
import com.proje.model.Order;

@WebServlet("/OrdersServlet")
public class OrdersController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public HttpServletRequest request;
    public HttpServletResponse response;
    
    public OrdersController(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public void index() throws ServletException, IOException {
        if (com.proje.controller.login.LoginController.session != null) {
            ArrayList <Order> orders = OrderDAO.getOrderByUserId(Integer.parseInt(String.valueOf(com.proje.controller.login.LoginController.session.getAttribute("user_id"))));
            request.setAttribute("orders", orders);
            RequestDispatcher dispatcher = request.getRequestDispatcher("orders.jsp");
            dispatcher.forward(request, response);
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login");
            dispatcher.forward(request, response);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = com.proje.controller.login.LoginController.session;
        
        if (session == null || session.getAttribute("user") == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login");
            dispatcher.forward(request, response);
            return;
        }
            
        String toDo = request.getParameter("toDo");
        if(toDo.equals("add")) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.now();
                    
            Order order = new Order();
            order.setCustomerNo(String.valueOf(session.getAttribute("user_id")));
            order.setOrderDate(String.valueOf(dtf.format(localDate)));
            
            order.setProductNo(String.valueOf(request.getParameter("product_no")));
            order.setPaymentNo(String.valueOf("2")); // TODO: PaymentNo neyse ona göre düzenlenecek
            OrderDAO.add(order);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("orders");
            dispatcher.forward(request, response);
            
        }else if(toDo.equals("delete")) {
            Order order = new Order();
            order.setOrderNo(String.valueOf(request.getParameter("order_no")));
            OrderDAO.delete(order);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("orders");
            dispatcher.forward(request, response);
        }
    }
}