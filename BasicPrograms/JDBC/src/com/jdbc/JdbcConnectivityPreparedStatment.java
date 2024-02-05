package com.jdbc;

import java.sql.*;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class JdbcConnectivityPreparedStatment {

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
		System.out.println("ENter course name:");
		String cname = sc.next();
		System.out.println("Enter duration");
		int cduration = sc.nextInt();
		System.out.println("enter course price:");
		int cprice = sc.nextInt();

		Class.forName(s);
		co = DriverManager.getConnection(url, username, userpass);
		System.out.println("connected to database...");
		System.out.println("succes");
		sql = "insert into course values(?,?,?,?)";
		System.out.println("sdv");
		smt = co.prepareStatement(sql);
		smt.setInt(1, cid);
		smt.setString(2, cname);
		smt.setInt(3, cduration);
		smt.setInt(4, cprice);

		System.out.println("Querry:" + smt);
		int i = smt.executeUpdate();
		smt.close();
		co.close();
		sc.close();

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