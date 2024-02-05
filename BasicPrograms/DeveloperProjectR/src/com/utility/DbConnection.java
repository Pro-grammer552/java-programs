package com.utility;

import java.sql.*;

public class DbConnection {

	static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/developerteamr";
	static String username = "root";
	static String userpass = "rootroot";
	static Connection conn;

	public static Connection getConnect() {

		try {
			Class.forName(driver);
			System.out.println("Driver Loaded");
			conn = DriverManager.getConnection(url, username, userpass);
			System.out.println("Connected to DB...");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return conn;

	}
}
