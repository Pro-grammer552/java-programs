package com.airithmeticException;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			//System.out.println(10 / 0);

			System.out.println(e.getMessage());

		} finally {
			System.out.println("Always Execute");
		}
		System.out.println("End");
	}

}
