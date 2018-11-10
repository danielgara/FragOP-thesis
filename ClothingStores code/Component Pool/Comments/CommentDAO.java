package models;

import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import db.DB;

public class CommentDAO {
	public static java.sql.Statement st = null;
	public static java.sql.PreparedStatement ps = null;
	public static java.sql.ResultSet rs = null;
	public static Connection conn = null;
	
	public static ArrayList<Comment> getCommentsByPID(int pid){
	    ArrayList<Comment> comments = new ArrayList<Comment>();
	    try {
	    	conn = DB.getConexion();
	    	st = conn.createStatement();
	        rs = st.executeQuery("SELECT * FROM comment WHERE product = '"+pid+"'");
	        while (rs.next()) {
	        	Comment commen = new Comment(rs.getInt("id"),rs.getInt("product"),rs.getString("description"),rs.getString("date"));
	        	comments.add(commen);
	        }
	        rs.close();
	    } catch (Exception e) { e.printStackTrace(); }

	    return comments;
	}
	
	public static void insert(Comment c){  
		try {
			conn = DB.getConexion();
			
			st = conn.createStatement();
	    	st.executeUpdate("INSERT INTO comment (product, description) VALUES ('"+c.getProduct()+"', '"+c.getDescription()+"');");		
		}
		catch(Exception e){	e.printStackTrace(); }
		finally{
			try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
		}
	}

	/*B-method-zone*/

}
