package com.factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Item s1 = new Item();
		System.out.println("Select Item:");
		System.out.println("1.Book  200rs");
		System.out.println("2.Pen   100rs");
		System.out.println("3.Mouse  500rs");
		System.out.println("4.Keyboard 1000");
		System.out.println("Enter Item :");
		int choice = sc.nextInt();
		System.out.println("Enter Item name:");
		String itemname = sc.next();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		int totalprice = 0;

		switch (choice) {
		case 1: {

			System.out.println("Book selected");
			System.out.println("Enter total number ");
			count1 = sc.nextInt();
			totalprice = totalprice * count1 * 200;

			break;

		}
		case 2: {

			System.out.println("Pen selected");
			System.out.println("Enter total number ");
			count2 = sc.nextInt();
			totalprice = totalprice * count2 * 100;
			break;

		}
		case 3: {

			System.out.println("Mouse selected");
			System.out.println("Enter total number ");
			count3 = sc.nextInt();
			totalprice = totalprice * count3 * 500;
			break;

		}
		case 4: {

			System.out.println("Keyboard selected");
			System.out.println("Enter total number ");
			count4 = sc.nextInt();
			totalprice = totalprice * count4 * 1000;
			break;

		}

		default:
			System.out.println("invalid choice");
		}
		System.out.println(totalprice);

		paymentfactory p1 = new paymentfactory();
		System.out.println("Enter mode you want to pay");
		System.out.println("Credit card payment");
		System.out.println("Debit card payment");
		System.out.println("Upi payment");
		String typepayment = sc.next();

		p1.choosepaymentType(typepayment, totalprice);

	}
}