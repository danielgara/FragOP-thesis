Fragment Cart-AlterProductDAO { 
   Action: add
   Priority: high
   FragmentationPoints: method-zone
   PointBracketsLan: java
   Destinations: ProductModel-ProductDAO
   SourceCode: [ALTERCODE-FRAG]public static ArrayList<Product> getProductsByIds(String ids){
       ArrayList<Product> products = new ArrayList<Product>();
       try {
         conn = DB.getConexion();
         st = conn.createStatement();
           rs = st.executeQuery("SELECT * FROM product WHERE id IN ("+ids+");");
           while (rs.next()) {
            Product one_product = new Product(rs.getInt("id"),rs.getString("name"),rs.getInt("price"),rs.getString("img"));
            products.add(one_product);
           }
           rs.close();
       } catch (Exception e) { e.printStackTrace(); }

       return products;
   }[/ALTERCODE-FRAG]
}

