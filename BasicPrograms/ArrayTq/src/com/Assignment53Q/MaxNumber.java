package com.Assignment53Q;

public class MaxNumber {

	public static void main(String[] args) {
		int[] a = { 4, 9, 6, 5, 4, 4, 8, 9 };
		int  max = a[0];
		for (int i = 0; i < a.length; i++) {

			

			if (max < a[i]) {
				max = a[i];

			}

		}
		 System.out.println(max);
	}

}
