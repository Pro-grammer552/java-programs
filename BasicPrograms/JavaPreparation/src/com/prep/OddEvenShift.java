package com.prep;

import java.util.Arrays;

public class OddEvenShift {

	public static void main(String[] args) {

		int arr[] = {9, 2, 3, 4, 5, 6};
		int arr1[] = new int[arr.length];

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr1[index] = arr[i];
				index++;
			}
			
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 1) {
				arr1[index] = arr[j];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
