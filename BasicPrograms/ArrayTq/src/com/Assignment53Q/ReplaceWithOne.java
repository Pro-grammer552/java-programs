package com.Assignment53Q;

import java.util.Arrays;

public class ReplaceWithOne {

	public static void replaceOne(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			}

			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 0, 0, 0, 25 };

		replaceOne(arr);
		System.out.println(Arrays.toString(arr));

	}

}
