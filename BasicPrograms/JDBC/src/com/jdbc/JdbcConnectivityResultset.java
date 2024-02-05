package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JdbcConnectivityResultset {

	public static void FetchAllDetails() throws ClassNotFoundException, SQLException {

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/studentdb";

			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection(url, "root", "rootroot");
			System.out.println("Connected to DataBAse...");

			String sql = "select * from student";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

				System.out.println(rs.getInt(1) + "||" + rs.getString(2) + "||" + rs.getString(3));
			}

		}
	}

	public static void main(String[] args) {

		try {
			FetchAllDetails();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}