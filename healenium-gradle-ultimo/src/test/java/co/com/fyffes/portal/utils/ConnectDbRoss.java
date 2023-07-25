package co.com.fyffes.portal.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class to establish database connection to fin_test database
 * SQL Server.
 * @author Diego Alvarez
 *
 */

public class ConnectDbRoss {

	public static Connection connectDb() {

		Connection conn = null;

	try {
		/*
		String url = "jdbc:sqlserver://rossprod;databasename=fin_test";
		String username = "spoon_erp";
		String password = "FyffesKPIs2021";
		*/
		String url = "jdbc:sqlserver://rossprod;databasename=fin_test";
		String username = "spoon_erp";
		String password = "q1371GC4YfI@";
		conn = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return conn;

  }
}
