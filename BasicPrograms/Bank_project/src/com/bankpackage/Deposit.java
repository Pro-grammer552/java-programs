package com.bankpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Deposit {

	 public static void depositMoney(int c_id, double amount) throws InvalidTransactionAmountException {
	        Connection conn = null;
	        try {
	            conn = DBConnection.getConnect();

	            long a_no = getAccountNumber(conn, c_id);

	            if (a_no != -1) {
	                if (amount <= 0) {
	                    throw new InvalidTransactionAmountException("Invalid deposit amount.");
	                }

	                double currentBalance = getCurrentBalance(conn, a_no);

	                // Update the balance with the deposited amount
	                double newBalance = currentBalance + amount;
	                updateBalance(conn, a_no, newBalance);

	                // Log the deposit transaction
	                logTransaction(conn, a_no, "Deposit", amount);
	                System.out.println("Deposit successful. New balance: " + newBalance);
	            } else {
	                System.out.println("Deposit failed. Account not found for the logged-in user.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	private static long getAccountNumber(Connection conn, int c_id) throws SQLException {
		String sql = "SELECT a_no FROM account_details WHERE c_id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, c_id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return rs.getLong("a_no");
		}
		return -1; // Account not found for the customer
	}

	private static double getCurrentBalance(Connection conn, long a_no) throws SQLException {
		String sql = "SELECT balance FROM account_details WHERE a_no = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setLong(1, a_no);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return rs.getDouble("balance");
		}
		throw new SQLException("Account not found.");
	}

	private static void updateBalance(Connection conn, long a_no, double newBalance) throws SQLException {
		String sql = "UPDATE account_details SET balance = ? WHERE a_no = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, newBalance);
		ps.setLong(2, a_no);
		ps.executeUpdate();
	}

	private static void logTransaction(Connection conn, long a_no, String t_type, double amount) throws SQLException {
		String sql = "INSERT INTO transaction_details (t_type, t_amount, t_date, a_no) VALUES (?, ?, NOW(), ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, t_type);
		ps.setDouble(2, amount);
		ps.setLong(3, a_no);
		ps.executeUpdate();
	}
}