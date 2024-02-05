package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question18 {

	/*
	 * 18. WAP to add 1 to 50 numbers in ArrayList and print only even numbers
	 * (using iterator)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				arr1.add(i);
			}
		}
		//System.out.println(arr1);

		Iterator<Integer> itr = arr1.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
