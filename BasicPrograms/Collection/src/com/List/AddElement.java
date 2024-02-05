package com.List;

import java.util.ArrayList;
import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();

		ArrayList<String> arr1 = new ArrayList<>(size);

		System.out.println("Enter " + size + " names:");
		for (int i = 0; i < size; i++) {
			String name = sc.next();
			arr1.add(name);
		}

		for (String s : arr1) {
			System.out.print(s.toUpperCase() + " ");
		}

		// System.out.println(arr1.toString().toUpperCase());

	}

}
