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

@WebServlet(urlPatterns = {"/Admin/Home"})
public class Home extends HttpServlet {
	
	/*B-validation-function*/
	protected boolean validation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	return true;
	}
	/*E-validation-function*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	if(this.validation(request, response)){          
	        request.setAttribute("title", "Admin Panel");
	        RequestDispatcher view = request.getRequestDispatcher("../views/admin/index.jsp");
	        view.forward(request, response);  
    	}
    }
}