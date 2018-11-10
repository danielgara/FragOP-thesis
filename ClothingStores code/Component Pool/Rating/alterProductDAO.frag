Fragment Rating-AlterProductDAO { 
   Action: add
   Priority: high
   FragmentationPoints: constructor-attribute-zone, constructor-attribute-zone2
   PointBracketsLan: java
   Destinations: ProductModel-ProductDAO, ProductModel-ProductDAO
   SourceCode: [ALTERCODE-FRAG],rs.getInt("num_rates"),rs.getInt("total_rates")[/ALTERCODE-FRAG]
}

Fragment Rating-AlterProductDAO2 { 
   Action: add
   Priority: high
   FragmentationPoints: method-zone
   PointBracketsLan: java
   Destinations: ProductModel-ProductDAO
   SourceCode: [ALTERCODE-FRAG]public static void updateRating(Product p){  
      try {
         conn = DB.getConexion();
         
         st = conn.createStatement();
         st.executeUpdate("UPDATE product set "
               + " total_rates='"+p.getTotal_rates()+"',"
               + " num_rates='"+p.getNum_rates()+"'"
               + "  WHERE id = '"+p.getId()+"';");    
      }
      catch(Exception e){  e.printStackTrace(); }
      finally{
         try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
      }
   }[/ALTERCODE-FRAG]
}
