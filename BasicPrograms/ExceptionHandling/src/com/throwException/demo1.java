package com.throwException;

public class demo1 {

	public void checkAge(int age) {
		if (age < 30) {
			throw new ArithmeticException("CAndidate not eligible");
		} else {
			System.out.println("Candidate eligible");
		}
	}

	public static void main(String[] args) {

		System.out.println("=========Start=============");

		demo1 d = new demo1();

		try {
			d.checkAge(15);     //use try catch otherwise it will show exception
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		System.out.println("====end========");

	}

}
