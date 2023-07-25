package co.com.fyffes.portal.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class to establish database connection to fyffesna_test database
 * SQL Server.
 * @author Diego Alvarez
 *
 */

public class ConnectDbFyffes {
	
	

	public Connection connectDb() {

		Connection conn_f = null;

	try {
		String url = "jdbc:sqlserver://rossprod;databasename=fyffesna_test"; //"jdbc:sqlserver://rossprod;databasename=fyffesna_test"
		String username = "spoon_erp";
		String password = "q1371GC4YfI@";
		
		conn_f = DriverManager.getConnection(url, username, password);		
	} catch (SQLException e) {		
		e.printStackTrace();
	}
	return conn_f;
	
  }	
}
