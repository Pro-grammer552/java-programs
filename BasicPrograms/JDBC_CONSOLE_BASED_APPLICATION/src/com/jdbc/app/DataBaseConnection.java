package com.jdbc.app;

import java.sql.*;

public class DataBaseConnection {

	 String driver = "com.mysql.cj.jdbc.Driver";
	 static String username = "root";
	 static String userpass = "rootroot";
	 static String url = "jdbc:mysql://localhost:3306/testcoursedb";

	public DataBaseConnection() {

		try {
			Class.forName(driver);
			System.out.println("Successfully Connected..");
		} catch (Exception e) {

			throw new RuntimeException("Something went Wrong..." + e);
		}

	}// constructor

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, userpass);
	}

}
