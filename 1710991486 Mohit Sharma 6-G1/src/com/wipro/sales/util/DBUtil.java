package com.wipro.sales.util;
import java.sql.*;

public class DBUtil {

	private static Connection con=null;
	
	public static Connection getDBConnection() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "keshavmohan1");
			return con;
		} catch (SQLException e) {
			System.out.println("Connection could not be estanlished");
			e.printStackTrace();
			return null;
		}
		
	}
}
