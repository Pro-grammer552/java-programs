package com.bankpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BankTest {
	private static int loggedInCustomerId = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to the Bank System");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Select an option: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				registerCustomer(sc);
				break;
			case 2:
				loggedInCustomerId = loginCustomer(sc);
				if (loggedInCustomerId != -1) {
					performBankOperations(sc);
					loggedInCustomerId = -1; // Logout
				}
				break;
			case 3:
				System.out.println("Exiting the program.");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
	}

	private static void registerCustomer(Scanner sc) {
		try (Connection conn = DBConnection.getConnect()) {
			System.out.print("Enter customer name: ");
			String c_name = sc.next();
			System.out.print("Enter customer email: ");
			String c_email = sc.next();
			System.out.print("Enter customer contact: ");
			String c_phone = sc.next();
			System.out.print("Enter customer address: ");
			String c_adr = sc.next();
			System.out.print("Enter password: "); // Add password for security
			String c_password = sc.next();
			System.out.print("Enter account type: ");
			String a_type = sc.next();

			if (!isCustomerExists(conn, c_email)) {
				String sql = "INSERT INTO customer_details (c_name, c_email, c_phone, c_adr, c_password, a_type) VALUES (?, ?, ?, ?, ?, ?)";
				PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, c_name);
				ps.setString(2, c_email);
				ps.setString(3, c_phone);
				ps.setString(4, c_adr);
				ps.setString(5, c_password); // Store the password securely
				ps.setString(6, a_type);

				int result = ps.executeUpdate();

				if (result > 0) {
					ResultSet rs = ps.getGeneratedKeys();
					if (rs.next()) {
						loggedInCustomerId = rs.getInt(1); // Set the logged-in customer ID
						System.out.println("Registration successful. Customer ID: " + loggedInCustomerId);
					} else {
						System.out.println("Failed to retrieve customer ID.");
					}
					String insertAccountSQL = "INSERT INTO account_details (a_type, a_date, c_id, a_role, balance, a_status) VALUES (?, NOW(), ?, ?, ?, ?)";
					PreparedStatement aps = conn.prepareStatement(insertAccountSQL);
					aps.setString(1, a_type);
					aps.setLong(2, loggedInCustomerId);
					aps.setString(3, "Primary Account Holder"); // Set the default role
					aps.setDouble(4, 0.00); // Set initial balance to 0.00
					aps.setString(5, "Active"); // Set the default account status

					int rs1 = aps.executeUpdate();

					if (rs1 > 0) {
						System.out.println("Account created successfully.");
					} else {
						System.out.println("Failed to create an account.");
					}
				} else {
					System.out.println("Registration failed.");
				}
			} else {
				System.out.println("Customer with this email already exists.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static boolean isCustomerExists(Connection conn, String c_email) throws SQLException {
		String sql = "SELECT COUNT(*) FROM customer_details WHERE c_email = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c_email);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int count = rs.getInt(1);
			return count > 0;
		}
		return false;
	}

	private static int loginCustomer(Scanner sc) {
		System.out.print("Enter customer email: ");
		String c_email = sc.next();
		System.out.print("Enter customer password: ");
		String c_password = sc.next();

		try (Connection conn = DBConnection.getConnect()) {
			String sql = "SELECT c_id FROM customer_details WHERE c_email = ? AND c_password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c_email);
			ps.setString(2, c_password);

			ResultSet resultSet = ps.executeQuery();

			if (resultSet.next()) {
				int c_id = resultSet.getInt("c_id");
				System.out.println("Login successful. Welcome, Customer ID: " + c_id);
				return c_id;
			} else {
				System.out.println("Login failed. Invalid credentials.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1; // Return -1 to indicate login failure
	}

	private static void performBankOperations(Scanner sc) {
		while (true) {
			System.out.println("Logged in as Customer ID: " + loggedInCustomerId);
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Logout");
			System.out.print("Select an option: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the deposit amount: ");
				double d_amount = sc.nextDouble();
				try {
					Deposit.depositMoney(loggedInCustomerId, d_amount);
				} catch (InvalidTransactionAmountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.print("Enter the withdrawal amount: ");
				double w_amount = sc.nextDouble();
				try {
					Withdraw.withdrawMoney(loggedInCustomerId, w_amount);
				} catch (InsufficientBalanceException | InvalidTransactionAmountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Logging out.");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
	}

}
