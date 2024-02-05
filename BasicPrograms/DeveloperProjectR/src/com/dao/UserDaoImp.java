package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pojo.Account;
import com.pojo.User;
import com.utility.DbConnection;

public class UserDaoImp implements Userdao {

	Connection conn = DbConnection.getConnect();
	PreparedStatement ps, ps1, ps2;
	Statement stmt;
	ResultSet rs;
	int result;
	String sql, sql1, sql2;
	User user;
	Account account;

	@Override
	public User showAccountDetails(int userId) throws SQLException {
		sql = "Select * from userinfo where userid = userId ";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		
		return user;



	public boolean depositAmount(int userid, double amount) throws SQLException {

		sql = "update accountinfo set balance = balance + ? where userid=?";
		ps = conn.prepareStatement(sql);

		ps.setDouble(1, amount);
		ps.setInt(2, userid);
		System.out.println("Query:" + ps);
		result = ps.executeUpdate();
		if (result > 0)
			return true;
		return false;

	}

	public boolean withdrawAmount(int userid, double amount) throws SQLException {
		sql = "update accountinfo set balance = balance - ? where userid=?";
		ps = conn.prepareStatement(sql);

		ps.setDouble(1, amount);
		ps.setInt(2, userid);
		System.out.println("Query:" + ps);
		result = ps.executeUpdate();
		if (result > 0)
			return true;
		return false;

	}

	@Override
	public boolean transferAmount(int userid, int tuserid, double amount) throws SQLException {

		sql1 = "update accountinfo set balance = balance - ? where userid=?";

		ps = conn.prepareStatement(sql1);
		ps.setDouble(1, amount);
		ps.setInt(2, userid);

		ps.executeUpdate();

		sql2 = "update accountinfo set balance = balance + ? where accono =?";
		ps = conn.prepareStatement(sql2);
		ps.setDouble(1, amount);
		ps.setInt(2, tuserid);

		ps.executeUpdate();

		System.out.println("Query:" + ps);

		return true;

	}

	@Override
	public void showBalance(int userid) throws SQLException {
		sql = "Select balance from accountinfo where userid = userid";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);

		if (rs.next()) {
			System.out.println("Your Acoount Balance : " + rs.getDouble(1));
		}

	}

	@Override
	public boolean addPayee(int acco) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public User searchUser(int userid, String userpass) throws SQLException {

		sql = "select u.userid,username,useremail,usercontact,userdob,userpan,useraadhar,useraddress,userpass,userrole,accono,acctype,balance,status"
				+ " from userinfo u join accountinfo a on u.userid=a.userid where u.userid=? and u.userpass = ?";

		ps = conn.prepareStatement(sql);
		ps.setInt(1, userid);
		ps.setString(2, userpass);

		rs = ps.executeQuery();

		if (rs.next()) {
			if (rs.getInt(1) == userid && rs.getString(9).equals(userpass)) {
				user = new User();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setUseremail(rs.getString(3));
				user.setUsercontact(rs.getString(4));
				user.setUserdob(rs.getString(5));
				user.setUserpan(rs.getString(6));
				user.setUseraadhar(rs.getString(7));
				user.setUseraddress(rs.getString(8));
				user.setUserpass(rs.getString(9));
				user.setUserrole(rs.getString(10));
				account = new Account(rs.getInt(11), rs.getInt(1), rs.getString(12), rs.getDouble(13),
						rs.getString(14));

				user.setAccount(account);
				return user;

			} else {
				return null;
			}
		} else {

			return null;
		}
	}
}
