package com.jdbc;

import java.sql.*;

public class JdbcConnectivityDelete {

	public static void getConnect() throws ClassNotFoundException, SQLException {

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/studentdb";

			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection(url, "root", "rootroot");
			System.out.println("Connected to DataBAse...");

			String sql = "delete from student where totalmarks=80";
			Statement stmt = con.createStatement();

			int result = stmt.executeUpdate(sql);
			System.out.println(result);

			if (result > 0) {

				System.out.println("Record deleted");

			} else {
				System.out.println("Record not deleted");
			}
		}

	}

	public static void main(String[] args) {

		try {
			getConnect();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
