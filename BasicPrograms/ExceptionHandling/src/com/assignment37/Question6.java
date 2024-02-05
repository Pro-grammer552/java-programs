package com.assignment37;
// WAP to show unchecked exception

public class Question6 {

	public static void main(String[] args) {
		String text = null;
		try {
			int length = text.length(); // This will throw a NullPointerException
			System.out.println("Length of text: " + length);
		} catch (NullPointerException e) {
			System.out.println( e.getMessage());
		}
		System.out.println("Program continues after the exception.");
	}
}