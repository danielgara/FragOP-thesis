package models;

import java.util.ArrayList;
import com.mysql.jdbc.Connection;
import db.DB;

/*B-import-zone*/

public class UserDAO {
	
	public static java.sql.Statement st = null;
	public static java.sql.PreparedStatement ps = null;
	public static java.sql.ResultSet rs = null;
	public static Connection conn = null;
	
	public static User getOneUser(String u, String p){
		User user = null;
		try {
	    	conn = DB.getConexion();  	
	    	st = conn.createStatement();
	    	rs = st.executeQuery("SELECT * FROM user WHERE user = '"+u+"' AND pass = '"+p+"'");
	        while (rs.next()) {
	        	user = new User(rs.getInt("id"),rs.getString("name"),rs.getString("type"),rs.getString("user"),rs.getString("pass"));
	        }
	        rs.close();
	    } catch (Exception e) { e.printStackTrace(); }		
		return user;
	}

	/*B-method-zone*/

}
