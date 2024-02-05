package com.airithmeticException;

public class DemoClassNotFoundException {

	public static void main(String[] args) {

		System.out.println("====Start===========");

		try {

			Class clsn = Class.forName("com.airithmeticException.demo1");
			System.out.println(clsn);

		} catch (ClassNotFoundException e) {

			System.out.println("please check the name of the class ");
			System.out.println(e);

		}
		System.out.println("=======end===========");

	}

}
