package project1.layers.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCConnection {

	private static Connection conn = null;

	public static Connection getConnection() {

		
		try {
			if (conn == null) {
				// Create a new connection
				
				// Hotfix to make sure DB is connected when app is open:
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//Get the information from a file
				FileInputStream input = new FileInputStream(JDBCConnection.class.getClassLoader().getResource("connection.properties").getFile());
				
				//Set the stream of information in the resource and load it into properties to use the set of key:value
				Properties p = new Properties();
				p.load(input);
				
				
				String url = p.getProperty("url");
				String user = p.getProperty("user");
				String password = p.getProperty("password");
				
				conn = DriverManager.getConnection(url, user, password);
				return conn;
			}
			//If it is not null, return the same connection
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//If everything fails, return null
		return null;
	}
	
}
