Fragment Login-AlterAdmin { 
   Action: replace
   Priority: high
   FragmentationPoints: validation-function, validation-function, validation-function, validation-function
   PointBracketsLan: java
   Destinations: BasicViewsAdmin-Home, CommentManagement-ManageComment, ProductManagement-ManageProducts, UserManagement-ManageUsers
   SourceCode: [ALTERCODE-FRAG]protected boolean validation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
    	User u = (User) session.getAttribute("datauser");
    	if(u == null) { response.sendRedirect("../Home"); return false;	}
    	else if(!u.getType().equals("admin")){
    		response.sendRedirect("../Home"); return false;
    	}
    	return true;
	}[/ALTERCODE-FRAG]
}