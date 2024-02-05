package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PayeeManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1;

		try {
			// Establish a database connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "username",
					"password");

			do {
				System.out.println("1. Add user in payee");
				System.out.println("2. Remove user from payee");
				System.out.println("3. Transaction");
				int num = sc.nextInt();

				switch (num) {
				case 1:
					System.out.println("Enter Account number to add user:");
					int accno = sc.nextInt();
					String name = findUsername(connection, accno);
					// Add the user to the database
					addUserToPayee(connection, accno, name);
					break;

				case 2:
					System.out.println("Enter Account number you want to remove:");
					int accToRemove = sc.nextInt();
					// Remove the user from the database
					removeUserFromPayee(connection, accToRemove);
					break;

				case 3:
					findUsername(connection, accno);
					// Perform transactions
					// ...
					break;
				}

				System.out.println("Do you want to continue? (Enter 'y' for yes):");
				ch1 = sc.next().charAt(0);

			} while (ch1 == 'y' || ch1 == 'Y');

			// Close the database connection
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Close the scanner
		sc.close();
	}

	private static String findUsername(Connection connection, int accno) throws SQLException {
		String username = null;

		String sql = "SELECT username FROM userinfo WHERE account_number = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, accno);

			// Execute the query and retrieve the result
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					username = resultSet.getString("username");
				}
			}
		}

		return username;
	}

	private static void addUserToPayee(Connection connection, int accno, String name) throws SQLException {
		// Insert the user into the payee table
		// Execute an INSERT query
		// ...
	}

	private static void removeUserFromPayee(Connection connection, int accno) throws SQLException {
		// Remove the user from the payee table
		// Execute a DELETE query
		// ...
	}
}
