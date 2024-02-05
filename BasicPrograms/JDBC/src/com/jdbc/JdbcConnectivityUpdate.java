package com.jdbc;

import java.sql.*;

public class JdbcConnectivityUpdate {

	public static void getConnectupdate() throws ClassNotFoundException, SQLException {

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/studentdb";

			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection(url, "root", "rootroot");
			System.out.println("Connected to DataBAse...");

			String sql = "update student set totalmarks=100 where sid=115 ";
			Statement stmt = con.createStatement();

			int result = stmt.executeUpdate(sql);
			System.out.println(result);

			if (result > 0) {

				System.out.println("Record updated");

			} else {
				System.out.println("Record not updated");
			}
		}
	}

	public static void main(String[] args) {

		try {
			getConnectupdate();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
