package com.userDefinedException;

import java.util.Scanner;

class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String msg) {
		super(msg);
	}
}

public class PurchaseBook {

	public static void checkBookId(int BookId) {

		if (BookId < 101 || BookId > 551) {
			throw new BookNotFoundException("Please check Your BookId");
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

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------Keep Shopping-------");
	}

}
