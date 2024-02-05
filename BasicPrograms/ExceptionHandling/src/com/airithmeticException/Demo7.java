package com.airithmeticException;

import java.util.InputMismatchException;

//more than one exception we can handle by nested try catch;

public class Demo7 {

	public static void main(String[] args) {
		String name = null;
		int num[] = { 4, 5, 50 };

		try {
			// block-1
			try {
				System.out.println(10 / 0);

			} catch (ArithmeticException e) {

				System.out.println(e.getMessage());

			}
			// block-2
			try {
				System.out.println(name.length());

			} catch (NullPointerException e) {

				System.out.println(e.getMessage());

			}
			// block-3
			try {
				System.out.println(num[5]);

			} catch (InputMismatchException e) {

				System.out.println(e.getMessage());

			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}
