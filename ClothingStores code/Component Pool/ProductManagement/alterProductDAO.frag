Fragment ProductManagement-AlterProductDAO { 
   Action: add
   Priority: high
   FragmentationPoints: method-zone
   PointBracketsLan: java
   Destinations: ProductModel-ProductDAO
   SourceCode: [ALTERCODE-FRAG]public static void remove(int id){  
    try {
      conn = DB.getConexion();      
      st = conn.createStatement();
        st.executeUpdate("DELETE from product WHERE id ='"+id+"';");  
    }
    catch(Exception e){ e.printStackTrace(); }
    finally{
      try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
    }
  }
  
  public static void insert(Product p){  
    try {
      conn = DB.getConexion();      
      st = conn.createStatement();
        st.executeUpdate("INSERT INTO product (name, description, price, img) VALUES ('"+p.getName()+"', '"+p.getDescription()+"', '"+p.getPrice()+"', '"+p.getImg()+"');");    
    }
    catch(Exception e){ e.printStackTrace(); }
    finally{
      try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
    }
  }[/ALTERCODE-FRAG]
}