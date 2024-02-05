
package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcConnectivity {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/studentdb";
			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection(url, "root", "rootroot");
			System.out.println("Connected to DataBAse...");
			Scanner sc=new Scanner(System.in);
			
			
			
			String sql = "insert into student values(116,'Suraj','reddy',"
					+ "'1999-05-27','M','suraj@gmail.com','98976543','B.E','100')";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);

			if (result > 0) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record not inserted");
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
