Fragment Login-AlterAccount { 
   Action: add
   Priority: high
   FragmentationPoints: login-zone
   PointBracketsLan: java
   Destinations: Account-Account
   SourceCode: [ALTERCODE-FRAG]HttpSession session = request.getSession();
      User u = (User) session.getAttribute("datauser");
      if(u == null) { response.sendRedirect("Home"); return;  }[/ALTERCODE-FRAG]
}