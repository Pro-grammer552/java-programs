package com.assignment50;

import java.util.ArrayList;

public class Question8 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

	
		names.add("Suraj");
		names.add("Keshav");
		names.add("abc");

		if (names.isEmpty()) {
			System.out.println("The ArrayList is empty.");
		} else {
			System.out.println("The ArrayList is not empty.");
		}
	}
}
