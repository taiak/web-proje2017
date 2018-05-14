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
import com.proje.DAO.ProductDAO;
import com.proje.model.Order;
import com.proje.model.Product;

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
        @SuppressWarnings("unchecked")
		ArrayList <Order> myOrders = (ArrayList<Order>) HomeController.session.getAttribute("myOrders");
        System.out.println(myOrders);

        ArrayList <Product> products = new ArrayList<Product>();
        Order order;
        Product product;
        float productPriceSum = 0;
        
        for (int i = 0; i < myOrders.size(); i++) {
			order = myOrders.get(i);
			product = ProductDAO.find(order.getProductNo());
			productPriceSum += Float.parseFloat(product.getPrice());
			products.add(product);
		}

        request.setAttribute("productPriceSum", productPriceSum);
        request.setAttribute("products", products);
        request.setAttribute("myOrders", myOrders);
		HomeController.session.setAttribute("orderCount", myOrders.size());

        RequestDispatcher dispatcher = request.getRequestDispatcher("orders.jsp");
        dispatcher.forward(request, response);

    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = com.proje.controller.login.LoginController.session;
        
        @SuppressWarnings("unchecked")
		ArrayList <Order> myOrders = (ArrayList<Order>) HomeController.session.getAttribute("myOrders");

            
        String toDo = request.getParameter("toDo");
        if(toDo.equals("add")) {
        	// Geçici Order Nesnesini Oluştur
            Order order = new Order();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.now();
            order.setOrderDate(String.valueOf(dtf.format(localDate)));
            order.setProductNo(String.valueOf(request.getParameter("product_no")));
            
            // Session'a Ekleme Yap
            if (myOrders.add(order)) {
                System.out.println("Başarılı " + myOrders);
            }else {
                System.out.println("BaşarıSIZ! " + myOrders);            	
            }
            HomeController.session.setAttribute("myOrders", myOrders);
            System.out.println("Session myOrders: " + HomeController.session.getAttribute("myOrders"));
            // Yönlendirme Yap
            RequestDispatcher dispatcher = request.getRequestDispatcher("orders");
            dispatcher.forward(request, response);
            
        }else if(toDo.equals("delete")) {
            int order_index = Integer.parseInt(request.getParameter("order_index"));
            myOrders.remove(order_index);
            HomeController.session.setAttribute("myOrders", myOrders);

            RequestDispatcher dispatcher = request.getRequestDispatcher("orders");
            dispatcher.forward(request, response);
        }else if(toDo.equals("orderPay")) {
        	if (session == null || session.getAttribute("user") == null) {
        		// Kullanıcı Giriş Yapmamış
                RequestDispatcher dispatcher = request.getRequestDispatcher("login");
                dispatcher.forward(request, response);
                return;
            }else {
            	// Kullanıcı Giriş Yapmış

                Order order;
                // Her siparişi veritabanına kaydet
                for (int i = 0; i < myOrders.size(); i++) {
        			order = myOrders.get(i);
                	// order_date ve product_no zaten siparişe ekli geliyor
        			order.setCustomerNo((String) session.getAttribute("user_id"));
        			order.setPaymentNo(request.getParameter("payment_no"));
        			OrderDAO.add(order);
        		}
                
                // Sessiondaki siparişleri temizle
                myOrders = new ArrayList<Order>();
                HomeController.session.setAttribute("myOrders", myOrders);
                
	            RequestDispatcher dispatcher = request.getRequestDispatcher("profile");
	            dispatcher.forward(request, response);
        	}
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("home");
            dispatcher.forward(request, response);
        }
    }
}