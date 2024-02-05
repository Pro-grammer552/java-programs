package LabHomeWork18_07;

/*
 A bank has a principal amount and a rate of interest which is 2%. 
 A savings account has a rate of interest 3% while a current account has 5%.
  Write a method that displays the rate of interest based on
   whether the account is default/ savings/ current.
 */

import java.util.Scanner;

class Bank {

	int principal_amount;
	int Interest=2 ;
	
	public void Interest() {
		System.out.println("\nYour acc has rate of interets is 2%. "+Interest);
	}

	public void Saving() {
		System.out.println("\nA saving acc has rate of interets is 3%. ");
	}

	public void Current() {
		System.out.println("\nA current acc has rate of interets is 5%. ");
	}
}

public class BankAccount {

	public static void main(String[] args) {

		Bank b = new Bank();

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Saving\n2.Current\n3.Interest");

		System.out.println("\nEnter Acc Type :");
		String ac = sc.next();

		if (ac.equals("Current")) {
			b.Current();
		} else if (ac.equals("Saving")) {
			b.Saving();
		} else if (ac.equals("Interest")) {
			b.Interest();
		} else {
			System.out.println("Error");
		}

	}

}

// TODO Auto-generated method stub
