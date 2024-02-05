package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class DatabaseUtil {

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static String username = "root";
	private static String userpass = "rootroot";
	private static String url = "jdbc:mysql://localhost:3306/employee";

	public DatabaseUtil() {

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
