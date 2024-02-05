package com.airithmeticException;

public class Demo2 {

	public static void main(String[] args) {

		int num[] = { 10, 20, 30, 40 };

		try {
			for (int i = 0; i <= num.length; i++) {
				System.out.println(num[i]);
			}
		} catch (IndexOutOfBoundsException e) {

			System.out.println(e);  //class & messgae
			System.out.println(e.getMessage());  //messgae 
			System.out.println(e.getClass()); // class 
			e.printStackTrace(); //class ,name ,description and line number 

			System.out.println("Exception Occure");
		}

	}

}
