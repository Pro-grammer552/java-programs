package com.prep;

import java.util.Arrays;

public class RotateArray {

	// output 3 4 5 6 1 2
	public static void main(String[] args) {

		int k = 2;
		int arr[] = {1, 2, 3, 4, 5, 6};
		int temp[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			// temp[arr.length - 1 - i] = arr[i]; //reverse
			// temp[(i+k)%arr.length]=arr[i];//clockwise

			temp[((i - k )+ arr.length) % arr.length] = arr[i];
		
			System.out.println(i-k);
		System.out.println(temp[((i - k )+ arr.length) % arr.length]);
			// //anticlockwise

			 System.out.println(Arrays.toString(temp));
		}

		for (int i = 0; i < arr.length; i++) {

			arr[i] = temp[i];
			System.out.println(Arrays.toString(arr));
		}

	}
}
