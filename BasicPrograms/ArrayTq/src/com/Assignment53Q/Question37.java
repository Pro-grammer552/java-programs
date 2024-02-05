package com.Assignment53Q;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num * (i + 1);
		}

		System.out.println("Table of " + num + ": ");
		
		
		
		 for (int i = 0; i < arr.length; i++) {
	            System.out.println(num + " x " + (i + 1) + " = " + arr[i]);
	        }
	}
}