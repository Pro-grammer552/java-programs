package com.jdbc.app;

import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) throws SQLException {

		RegionOperations regionOps = new RegionOperations();

		Scanner sc = new Scanner(System.in);

		boolean isrun = true;

		while (isrun) {
			System.out.println("Choose the table to perform operations on:");
			System.out.println("1. Regions");
			System.out.println("2. Countries");
			System.out.println("3. Locations");
			System.out.println("4. Departments");
			System.out.println("5. Employees");
			System.out.println("6. Jobs");
			System.out.println("7. Special Menu");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				regionOps.displayMenu();
				break;

			case 2:

				break;

			case 3:
				System.out.println("Exiting the application.");
				return;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}
