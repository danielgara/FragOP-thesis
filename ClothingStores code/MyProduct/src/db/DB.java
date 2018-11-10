package db;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DB {
	private static Connection connection;
	private static String driver = Config.db_driver;
	private static String url = Config.db_url;
	private static String user = Config.db_user;
	private static String password = Config.db_pass;
	
    private DB(){}
	
	public static Connection getConexion() {
		if (connection == null) {

			try {
				Class.forName(driver);
				connection = (Connection) DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
