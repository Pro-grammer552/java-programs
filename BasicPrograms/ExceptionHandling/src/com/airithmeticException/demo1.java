package com.airithmeticException;

//Arithmaetic Exception

public class demo1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
			System.out.println("HEllo"); // try block will not execute 

		}
		//System.out.println("HEllo");

		catch (ArithmeticException e) {

			System.out.println(10 / 10);
		}

		// System.out.println("END");
	}

}
