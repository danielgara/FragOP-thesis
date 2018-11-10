package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Contact"})
public class Contact extends HttpServlet {
	
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	request.setAttribute("title", "Contact Us");
	        RequestDispatcher view = request.getRequestDispatcher("views/contact.jsp");
	        view.forward(request, response);  
	    }

}
