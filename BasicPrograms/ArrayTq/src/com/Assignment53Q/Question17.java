package com.Assignment53Q;

import java.util.Arrays;

/*
 * 17.	WAP to merge 2 arrays to 3rd array. 
 * 3rd array should not have elements of same value.
 * 
 *arr3[] copy arr1
 *compare arr3 with arr2
 *if values are same 
 *contine;
 *not same 
 *arr2 in arr3;

 */

public class Question17 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 3, 4, 4, 5, 6 };

		int j = 0;
		int len1 = a.length;
		int len2 = b.length;

		int len3 = len1 + len2;
		int c[] = new int[len3];
		int i;
		boolean status = false;
		int index = 0;

		for (i = 0; i < len1; i++) {

			c[index++] = a[i];

		}

		for (j = 0; j < len2; j++)

		{
			status = false;
			for (int k = 0; k < index; k++) {

				if (c[k] == b[j]) {
					status = true;
				}
			}

			if (status) {
				continue;

			} else {
				c[index++] = b[j];

			}

		}

		for (int num : c) {
			if (num != 0)
				System.out.println(num);
		}
		// System.out.println(Arrays.toString(c));

	}
}
