package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.pojo.User;

public interface Userdao {

	User showAccountDetails(int userid) throws SQLException;
	boolean depositAmount(int userid,double amount) throws SQLException;
	boolean withdrawAmount(int userid,double amount) throws SQLException;
	boolean transferAmount(int userid ,int tuserid, double amount) throws SQLException;
	void showBalance(int userid) throws SQLException;
	boolean addPayee(int acco) throws SQLException;
	User searchUser(int userid, String userpass) throws SQLException;
	
}
