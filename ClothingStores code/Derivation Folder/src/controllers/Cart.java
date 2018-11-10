package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Product;
import models.ProductDAO;

@WebServlet("/Cart")
public class Cart extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Map<Integer, String> pincart = new HashMap<Integer, String>();
		List<Product> products = new ArrayList<Product>();
		
		String clear = request.getParameter("clear");
		if(clear != null && clear.equals("1")){
			session.removeAttribute("pincart");
		}
		
		String remove = request.getParameter("remove");
		if(remove != null){
			pincart=(HashMap<Integer, String>) session.getAttribute("pincart");
			pincart.remove(Integer.parseInt(remove));
			session.setAttribute("pincart", pincart);
		}

		if(null != session.getAttribute("pincart")){
			pincart=(HashMap<Integer, String>) session.getAttribute("pincart");
			if(pincart.size()>0){
				String ids=getIds(pincart);
				products=ProductDAO.getProductsByIds(ids);
			}
		}
		
		request.setAttribute("title", "Cart");
		request.setAttribute("products", products);
		request.setAttribute("qty", pincart);
        RequestDispatcher view = request.getRequestDispatcher("views/cart.jsp");
        view.forward(request, response);
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<Integer, String> pincart = new HashMap<Integer, String>();
		if(null != session.getAttribute("pincart")){
			pincart=(HashMap<Integer, String>) session.getAttribute("pincart");
		}
		String id = request.getParameter("id");
		String qty = request.getParameter("qty");
		pincart.put(Integer.parseInt(id), qty);
		
		session.setAttribute("pincart", pincart);
		response.sendRedirect("Cart");	
	}
	
	public String getIds(Map<Integer, String> pincart){
		String ids = "";
		List<Integer> intKeys = new ArrayList<Integer>(pincart.keySet());
		for (int i=0;i<intKeys.size();i++) {
		    ids=ids+intKeys.get(i)+",";
		}
		ids = ids.substring(0, ids.length() - 1);
		return ids;
	}

}
