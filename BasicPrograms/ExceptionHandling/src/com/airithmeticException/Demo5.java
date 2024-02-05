package com.airithmeticException;

public class Demo5 {

	public static void divide() {

		int a = 10;
		int b = 0;

		try {

			System.out.println(a / b);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		System.out.println("Start");
		divide();
		System.out.println("end");

	}

}
