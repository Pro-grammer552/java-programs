package com.Assignment53Q;

import java.util.Arrays;

//9,5,7,8
//o/p:8,9,5,7

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = { 9, 5, 7, 8 };
		int lastindex = arr[arr.length - 1];

		int last = arr.length - 1;

		for (int i = arr.length - 2; i >= 0; i--) {
			arr[last] = arr[i];
			last--;

			if (i == 0) {
				arr[i] = lastindex;

			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
