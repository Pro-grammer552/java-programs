package com.airithmeticException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = new int[5];

		int len = num.length;
		try {
			for (int i = 0; i < len; i++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("ENTER THE NUMBER");
				num[i] = sc.nextInt();

			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		for (int a: num) {

			System.out.println(a);
		}

	}
}
