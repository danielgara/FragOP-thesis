package models;

import java.util.ArrayList;
import com.mysql.jdbc.Connection;
import db.DB;
import models.Product;

public class ProductDAO {
	public static java.sql.Statement st = null;
	public static java.sql.PreparedStatement ps = null;
	public static java.sql.ResultSet rs = null;
	public static Connection conn = null;

	public static Product getProductByID(int id){
		Product pro = null;
		try {
	    	conn = DB.getConexion();  	
	    	st = conn.createStatement();
	    	rs = st.executeQuery("SELECT * FROM product WHERE id = '"+id+"'");
	        while (rs.next()) {
	        	pro = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("price"),rs.getString("img")/*B-constructor-attribute-zone*/);
	        }
	        rs.close();
	    } catch (Exception e) { e.printStackTrace(); }		
		return pro;
	}
	
	public static ArrayList<Product> getProducts(){
	    ArrayList<Product> products = new ArrayList<Product>();
	    try {
	    	conn = DB.getConexion();
	    	st = conn.createStatement();
	        String s = "SELECT * FROM product";
	        rs = st.executeQuery(s);
	        while (rs.next()) {
	        	Product one_product = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("price"),rs.getString("img")/*B-constructor-attribute-zone2*/);
	        	products.add(one_product);
	        }
	        rs.close();
	    } catch (Exception e) { e.printStackTrace(); }

	    return products;
	}

	/*B-method-zone*/

}
