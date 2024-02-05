package com.bankpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;

public class DBConnection 
{
	
	
	
	static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/bank_db";
	static String username = "root";
	static String userpass = "rootroot";
	static Connection conn = null;

	public static Connection getConnect()
	{
		try 
		{
			Class.forName(driver);
			System.out.println("Driver loaded");
			conn = DriverManager.getConnection(url, username, userpass);
			System.out.println("Connected to the database");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		return conn;
	}
}


