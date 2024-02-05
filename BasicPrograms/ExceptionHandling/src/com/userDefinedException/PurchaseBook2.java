package com.userDefinedException;

import java.util.Scanner;

class BookNotFoundException1 extends Exception {

	public BookNotFoundException1(String msg) {
		super(msg);
	}
}

public class PurchaseBook2 {

	public static void checkBookId(int BookId) throws BookNotFoundException1{

		if (BookId < 101 || BookId > 551) {
			throw new BookNotFoundException1("Please check Your BookId..Enter again");
		} else {
			System.out.println("Book FOund...!!");
		}

	}

	public static void main(String[] args) {
		System.out.println("----------Welcome to BOOKSTORE--------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id : ");
		int BookId = sc.nextInt();

		//PurchaseBook book = new PurchaseBook();

		try {
			checkBookId(BookId);

		} catch (BookNotFoundException1 e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------Keep Shopping-------");
	}

}
