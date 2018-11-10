package controllers.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Product;
import models.ProductDAO;
import models.User;

@WebServlet(urlPatterns = {"/Admin/Products"})
public class ManageProducts extends HttpServlet {
	
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
				ProductDAO.remove(Integer.parseInt(remove));
			}
	    	
	    	request.setAttribute("products",ProductDAO.getProducts());
	    	request.setAttribute("title", "Admin Panel - Products");
	        RequestDispatcher view = request.getRequestDispatcher("../views/admin/products.jsp");
	        view.forward(request, response);
		}
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		
		if(this.validation(request, response)){
			String name = request.getParameter("name");
			String desc = request.getParameter("description");
			String price = request.getParameter("price");
			String img = request.getParameter("img");
			
			Product p = new Product(name,desc,Integer.parseInt(price),img/*B-constructor-attribute-zone*/);
			ProductDAO.insert(p);
			response.sendRedirect("Products");
		}
	}


}
