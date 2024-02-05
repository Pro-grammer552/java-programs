package com.prep;

import java.util.ArrayList;

public class BookAddInCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Book1");
		list.add("Book2");
		list.add("Book3");

		for (String s : list) {
			System.out.println("Before Addition " + s);
		}
		System.out.println("----------------------------");

		list.add("Book2");

		list.add("Book4");

		for (String s : list) {
			System.out.println("After addition :" + s);
		}

	}

}
