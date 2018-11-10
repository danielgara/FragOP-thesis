Fragment Comments-AlterListProducts { 
   Action: add
   Priority: high
   FragmentationPoints: import-zone
   PointBracketsLan: java
   Destinations: ListOfProducts-ListProducts
   SourceCode: [ALTERCODE-FRAG]import models.CommentDAO;[/ALTERCODE-FRAG]
}

Fragment Comments-AlterListProducts2 { 
   Action: add
   Priority: high
   FragmentationPoints: oneproduct-zone
   PointBracketsLan: java
   Destinations: ListOfProducts-ListProducts
   SourceCode: [ALTERCODE-FRAG]request.setAttribute("comments",CommentDAO.getCommentsByPID(Integer.parseInt(id))); [/ALTERCODE-FRAG]
}