package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

@WebServlet("/Account")
public class Account extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		/*B-login-zone*/
    	
		request.setAttribute("title", "Account");
		request.setAttribute("user", u);
        RequestDispatcher view = request.getRequestDispatcher("views/account.jsp");
        view.forward(request, response);    	 
    }
}
