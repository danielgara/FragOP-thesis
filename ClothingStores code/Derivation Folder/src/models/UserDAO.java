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

/*Code injected by: UserManagement-AlterUserDAO*/
public static ArrayList<User> getUsers(){
      ArrayList<User> users = new ArrayList<User>();
      try {
        conn = DB.getConexion();
        st = conn.createStatement();
          rs = st.executeQuery("SELECT * FROM user");
          while (rs.next()) {
            User one_user = new User(rs.getInt("id"),rs.getString("name"),rs.getString("type"),rs.getString("user"),rs.getString("pass"));
            users.add(one_user);
          }
          rs.close();
      } catch (Exception e) { e.printStackTrace(); }

      return users;
  }
  
  public static void remove(int id){  
    try {
      conn = DB.getConexion();      
      st = conn.createStatement();
        st.executeUpdate("DELETE from user WHERE id ='"+id+"';"); 
    }
    catch(Exception e){ e.printStackTrace(); }
    finally{
      try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
    }
  }
  
  public static void insert(User u){  
    try {
      conn = DB.getConexion();      
      st = conn.createStatement();
      st.executeUpdate("INSERT INTO user (name, type, user, pass) VALUES ('"+u.getName()+"', '"+u.getType()+"', '"+u.getUser()+"', '"+u.getPass()+"');"); 
    }
    catch(Exception e){ e.printStackTrace(); }
    finally{
      try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
    }
  }
/*Code injected by: UserManagement-AlterUserDAO*/


}
