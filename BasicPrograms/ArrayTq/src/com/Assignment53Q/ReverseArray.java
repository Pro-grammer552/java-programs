package com.Assignment53Q;

import java.util.Arrays;

//output
//4,6,7,8

/*
 * int a=a1[0];
 *  int b=a1[arr.length-1];
 * int c=a1[a] int d=a1[b]
 * int temp=c; c=d; d=temp;

 */

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 8, 7, 6, 4 };

		int length = arr.length;
		int mid = length / 2;

		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			System.out.println(Arrays.toString(arr));
			System.out.println(temp);
			arr[i] = arr[length - 1 - i];
			System.out.println(Arrays.toString(arr));
			arr[length - 1 - i] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
