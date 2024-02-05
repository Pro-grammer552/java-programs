package com.dd_array;

import java.util.Arrays;

/*
 WAP to shuffle array. Means e.g. arr[] = [5, 6, 23, 67, 39, 10, 2] 
So output array is [6, 23, 67, 39, 10, 2, 5].
 */

public class ShuffleArray {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 23, 67, 39, 10, 2 };

		int temp = 0;
		for (int i = 1; i < arr.length; i++) {

			temp = arr[0];
			int k = 0;

			//swapping
			k = arr[i];
			arr[i] = arr[i - 1];
			arr[i - 1] = k;

		}
		temp = arr[arr.length - 1];

		System.out.println(Arrays.toString(arr));

	}

}
