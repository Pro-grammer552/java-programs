package com.assignment37;
//. WAP to show unchecked exception 
public class question5 {

	public static void main(String[] args) {
		int a = 5, b = 0;
		try {
			int result = a / b;
			System.out.println("Result: " + result);
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
