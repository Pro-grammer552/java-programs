package com.Assignment53Q;

import java.util.Arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 6, 4, 7, 8 };
		int arr1[] = new int[arr.length];
		int len = arr.length;

		int even[] = new int[10];
		int odd[] = new int[10];
		int i;

		int ieven = 0;
		int iodd = 0;

		for (i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				even[ieven] = arr[i];
				ieven++;
			}

			else {
				odd[iodd] = arr[i];
				iodd++;
			}
		}

		for (i = 0; i < ieven; i++) {
			System.out.println(even[i]);
			arr1[i] = even[i];
		}

		for (i = 0; i < iodd; i++) {
			System.out.println(odd[i]);
			arr1[ieven + i] = odd[i];
		}
		System.out.println(Arrays.toString(arr1));

	}

}
