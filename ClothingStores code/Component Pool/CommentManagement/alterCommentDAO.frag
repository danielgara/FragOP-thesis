Fragment CommentManagement-AlterCommentDAO { 
   Action: add
   Priority: high
   FragmentationPoints: method-zone
   PointBracketsLan: java
   Destinations: Comments-CommentDAO
   SourceCode: [ALTERCODE-FRAG]public static ArrayList<Comment> getComments(){
       ArrayList<Comment> comments = new ArrayList<Comment>();
       try {
         conn = DB.getConexion();
         st = conn.createStatement();
           rs = st.executeQuery("SELECT * FROM comment");
           while (rs.next()) {
            Comment one_comment = new Comment(rs.getInt("id"),rs.getInt("product"),rs.getString("description"),rs.getString("date"));
            comments.add(one_comment);
           }
           rs.close();
       } catch (Exception e) { e.printStackTrace(); }

       return comments;
   }
   
   public static void remove(int id){  
      try {
         conn = DB.getConexion();         
         st = conn.createStatement();
         st.executeUpdate("DELETE from comment WHERE id ='"+id+"';");   
      }
      catch(Exception e){  e.printStackTrace(); }
      finally{
         try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
      }
   }[/ALTERCODE-FRAG]
}