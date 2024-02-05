package com.singlton;

//lazy instatiation
//object will create after calling static method

class Book {

	private static Book book;

	private Book() {

	}

	public static Book getbook() {

		if (book == null) {
			book = new Book();
		}
		return book;

	}

}

public class TestSingltonDemo1 {

	public static void main(String[] args) {

		Book obj1 = Book.getbook();
		Book obj2 = Book.getbook();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
