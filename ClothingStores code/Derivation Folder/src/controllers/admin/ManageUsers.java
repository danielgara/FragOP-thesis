package controllers.admin;

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

@WebServlet(urlPatterns = {"/Admin/Users"})
public class ManageUsers  extends HttpServlet {
	
	/*B-validation-function*/

/*Code replaced by: Login-AlterAdmin*/
protected boolean validation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
    	User u = (User) session.getAttribute("datauser");
    	if(u == null) { response.sendRedirect("../Home"); return false;	}
    	else if(!u.getType().equals("admin")){
    		response.sendRedirect("../Home"); return false;
    	}
    	return true;
	}
/*Code replaced by: Login-AlterAdmin*/
/*E-validation-function*/
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
		if(this.validation(request, response)){    	
	    	String remove = request.getParameter("remove");
			if(remove != null){
				UserDAO.remove(Integer.parseInt(remove));
			}
	    	
	    	request.setAttribute("users",UserDAO.getUsers());
	    	request.setAttribute("title", "Admin Panel - Users");
	        RequestDispatcher view = request.getRequestDispatcher("../views/admin/users.jsp");
	        view.forward(request, response);
		}
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		
		if(this.validation(request, response)){
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			String name = request.getParameter("name");
			String type = request.getParameter("type");
			
			User u = new User(name,type,user,pass);
			UserDAO.insert(u);
			response.sendRedirect("Users");
		}
	}
}
