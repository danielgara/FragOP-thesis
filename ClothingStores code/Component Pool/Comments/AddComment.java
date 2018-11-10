package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Comment;
import models.CommentDAO;

@WebServlet(urlPatterns = {"/AddComment"})
public class AddComment  extends HttpServlet {
	
	public void doPost( HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {

		String product = request.getParameter("product");
		String desc = request.getParameter("description");
		
		Comment com= new Comment(Integer.parseInt(product),desc);
		CommentDAO.insert(com);
		
		response.sendRedirect("Products?id="+product);

    }

}
