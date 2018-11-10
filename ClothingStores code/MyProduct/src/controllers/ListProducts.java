package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;
import models.ProductDAO;
/*B-import-zone*/

@WebServlet(urlPatterns = {"/Products"})
public class ListProducts extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	RequestDispatcher view;
    	
    	if (request.getParameter("id") != null){
    		String id = request.getParameter("id");

            /*B-oneproduct-zone*/
    		
    		Product pro=ProductDAO.getProductByID(Integer.parseInt(id));          
            request.setAttribute("title", pro.getName());
            request.setAttribute("pro",pro);
            request.setAttribute("id",id);
            view = request.getRequestDispatcher("views/oneproduct.jsp");
    		
    	}else{     
            request.setAttribute("title", "Products");      
            request.setAttribute("products",ProductDAO.getProducts());
    
            view = request.getRequestDispatcher("views/listproducts.jsp");
        }
        view.forward(request, response);  
    }

    /*B-method-zone*/
    
    
}
