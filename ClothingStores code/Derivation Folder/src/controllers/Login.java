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
import models.UserDAO;

@WebServlet("/Login")
public class Login extends HttpServlet {
	public Login() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse
		response) throws ServletException, IOException {
		String logout = request.getParameter("logout");
		HttpSession session = request.getSession();
		if(logout != null && logout.equals("1")) {
			session.removeAttribute("logged");
			session.removeAttribute("user");
			session.removeAttribute("admin");
			session.removeAttribute("datauser");
			response.sendRedirect("Home");
		}
		else {
			request.setAttribute("title", "Login");
			RequestDispatcher view = request.getRequestDispatcher("views/login_form.jsp");
			view.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse
		response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		User u = UserDAO.getOneUser(user, pass);
		if(u != null) {
			if(u.getType().equals("admin")){
				session.setAttribute("admin", "1");
			}else{
				session.setAttribute("user", "1");
			}
			session.setAttribute("datauser", u);
			session.setAttribute("logged", "1");
			response.sendRedirect("Home");
		}
		else {
			response.sendRedirect("Login");
		}
	}
}
