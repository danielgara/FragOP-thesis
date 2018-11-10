Fragment Rating-AlterListProducts { 
   Action: add
   Priority: high
   FragmentationPoints: method-zone
   PointBracketsLan: java
   Destinations: ListOfProducts-ListProducts
   SourceCode: [ALTERCODE-FRAG]public void doPost( HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {

		String n = request.getParameter("rating");
		String id = request.getParameter("id");

		Product pro=ProductDAO.getProductByID(Integer.parseInt(id));
		pro.setTotal_rates(pro.getTotal_rates()+Integer.parseInt(n));
		pro.setNum_rates(pro.getNum_rates()+1);
		ProductDAO.updateRating(pro);
		
		response.sendRedirect("Products?id="+pro.getId());
    }[/ALTERCODE-FRAG]
}