package com.bank;

import java.util.*;

class InvalidEmail extends Exception {

	public InvalidEmail(String msg) {
		super(msg);
	}
}

public class Main_interface {
	static HashMap<Integer, Register> h = new HashMap<Integer, Register>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("    **** Welcome To Coder Bank ****");
			System.out.println("Register && Create Account \n ");
			System.out.println("1.Registration\n2.Login\n3.Exit");
			int frontpage = sc.nextInt();

			switch (frontpage) {
			case 1:
				register();
				break;
			case 2:
				login();
				break;
			case 3:
				System.out.println("Visit Again");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (true);
	}

	private static void register() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Registration");
		System.out.println("Enter your Name:");
		String name = sc.next();
		System.out.println("Enter your Phone number:");
		int ph = sc.nextInt();
		System.out.println("Enter Account number:");
		int Acc_num = sc.nextInt();
		String email = "";
		while (true) {
			try {
				System.out.println("Enter your Email:");
				email = sc.next();
				if (email.contains("@") && email.length() > 4) {

				} else {
					throw new InvalidEmail("Please enter a valid email using @...");
				}

				break;
			} catch (InvalidEmail e) {
				System.err.println(e.getMessage());

			}
		}

		System.out.println("Enter your Phone Bank Balance:");
		int balance = sc.nextInt();
		System.out.println("Enter your Password:");
		String passward = sc.next();

		h.put(Acc_num, new Register(name, ph, Acc_num, email, balance, passward));
	}

	private static void login() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to login page");
		System.out.println("Enter your account number to log in:");
		int id = sc.nextInt();
		System.out.println("Enter your password:");
		String password = sc.next();

		Register user = h.get(id);

		if (user != null && user.getPassward().equals(password)) {
			System.out.println("Successfully Logged in..");
			afterLogin(user);
		} else {
			System.out.println("Invalid Username & Password");
		}
	}

	private static void afterLogin(Register user) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nChoose an option:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Display Transaction History");
			System.out.println("5. Logout");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter the amount to deposit:");
				int depositAmount = sc.nextInt();
				user.setBalance(user.getBalance() + depositAmount);
				System.out.println("Deposit successful. Updated balance: " + user.getBalance());
				user.addTransaction(new Transaction("Deposit", depositAmount));
				break;
			case 2:
				System.out.println("Enter the amount to withdraw:");
				int withdrawAmount = sc.nextInt();
				if (withdrawAmount <= user.getBalance()) {
					user.setBalance(user.getBalance() - withdrawAmount);
					System.out.println("Withdrawal successful. Updated balance: " + user.getBalance());
					user.addTransaction(new Transaction("Withdrawal", withdrawAmount));
				} else {
					System.out.println("Insufficient funds.");
				}
				break;
			case 3:
				System.out.println("Balance: " + user.getBalance());
				break;
			case 4:
				System.out.println("Transaction History:");
				displayTransactionHistory(user.getTransactionHistory());
				break;
			case 5:
				System.out.println("Logged out.");
				return; // Exit the method to return to the main menu
			default:
				System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void displayTransactionHistory(List<Transaction> transactions) {
		if (transactions.isEmpty()) {
			System.out.println("No transaction history.");
			return;
		}

		for (Transaction transaction : transactions) {
			System.out.println("Type: " + transaction.getType() + ", Amount: " + transaction.getAmount());
		}
	}
}
