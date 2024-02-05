package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcConnectivityPreparedStatment2 {
	static String s = "com.mysql.cj.jdbc.Driver";
	static String username = "root";
	static String userpass = "rootroot";
	static String url = "jdbc:mysql://localhost:3306/studentdb";

	static Connection co;
	static PreparedStatement smt;
	static String sql;

	public static void getconnect() throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		int cid = sc.nextInt();

		Class.forName(s);
		co = DriverManager.getConnection(url, username, userpass);
		System.out.println("connected to database...");
		System.out.println("succes");
		sql = "select * from student where sid = ?";
		System.out.println("sdv");
		smt = co.prepareStatement(sql);
		smt.setInt(1, cid);
		ResultSet r = smt.executeQuery();

		while (r.next()) {
			System.out.println(r.getInt(1) + " " + r.getString(2));
		}
	}

	public static void main(String[] args) {

		try {
			getconnect();
		} catch (ClassNotFoundException e) {
			System.out.println("Not loded");
		} catch (SQLException e) {
			System.out.println("connection not establish");
			e.printStackTrace();
		}
	}

}