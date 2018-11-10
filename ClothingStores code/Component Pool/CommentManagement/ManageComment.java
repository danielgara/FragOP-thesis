package controllers.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Comment;
import models.CommentDAO;
import models.User;

@WebServlet(urlPatterns = {"/Admin/Comments"})
public class ManageComment  extends HttpServlet {
	
	/*B-validation-function*/
	protected boolean validation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	return true;
	}
	/*E-validation-function*/
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		if(this.validation(request, response)){
	    	String remove = request.getParameter("remove");
			if(remove != null){
				CommentDAO.remove(Integer.parseInt(remove));
			}
	    	
	    	request.setAttribute("comments",CommentDAO.getComments());
	    	request.setAttribute("title", "Admin Panel - Comments");
	        RequestDispatcher view = request.getRequestDispatcher("../views/admin/comments.jsp");
	        view.forward(request, response);
		}
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		
		if(this.validation(request, response)){
			String product = request.getParameter("product");
			String desc = request.getParameter("description");
			
			Comment c = new Comment(Integer.parseInt(product),desc);
			CommentDAO.insert(c);
			response.sendRedirect("Comments");
		}
	}

}
