package com.Assignmentlab;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {

	public static void order(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j])

				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number");
			arr[i] = sc.nextInt();

		}
		try {
			order(arr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
