package com.prep;

import java.util.Arrays;

public class AccentureCode {

	public static void main(String[] args) {
		int sum = 4;

		int res = 0;
		// int arr[] = {5, 4, 2, 3, 9, 1, 7};
		int arr[] = {9, 8, -7, 3, 9, 3};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		// System.out.println(arr[0]);
		// System.out.println(arr[1]);

		if (arr[0] + arr[1] < sum) {
			res = arr[0] * arr[1];
		}
		System.out.println(res);

	}

}
