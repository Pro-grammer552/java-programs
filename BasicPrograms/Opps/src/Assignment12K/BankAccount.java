package Assignment12K;

import java.util.Scanner;

/*
create account class which contains account id customer name and balance 
create METhod to use accept details display details withdrawal and check balance
*/

public class BankAccount {

	int AccountId;
	String customerName;
	int amount;

	public void declare(int I, String n, int a) {

		AccountId = I;
		customerName = n;
		amount = amount;

	}

	public void Accept() {
		
		System.out.println("Banking System Menu\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the AccountId :");
		int I = sc.nextInt();

		System.out.print("Enter the CustomerName :");
		String n = sc.next();

		System.out.println("Enter the Amount");
		int amount = sc.nextInt();

		
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter the amount to deposit: ");
			int depositAmount = sc.nextInt();
			amount = amount + depositAmount;
			System.out.println(amount);
			System.out.println("Deposit successful!");
			break;
		case 2:
			System.out.println("Enter the Amount to withdraw");
			int withdraw = sc.nextInt();
			amount = amount - withdraw;
			System.out.println(amount);
			System.out.println("Withdraw successful!");
			break;
		case 3:
			System.out.println("your Current Balance " + amount);
			break;
		default:
			System.out.println("exit...Please try again");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		
		BankAccount bk = new BankAccount();
		bk.Accept();

		//bk.declare(I, n, amount);

	}

}