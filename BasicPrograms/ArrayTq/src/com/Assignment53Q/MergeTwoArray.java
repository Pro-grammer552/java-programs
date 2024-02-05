package com.Assignment53Q;

import java.util.Arrays;





public class MergeTwoArray {
	
	
	

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 60, 70, 80, 90, 100 };

		int c[] = new int[10];

		int len1 = a.length;
		int len2 = b.length;

		int len3 = len1 + len2;

		int i;
		int j = 0;

		for (i = 0; i < len3/2; i++) {
			if (i < len1) {
				c[i] = a[i];
			} else {
				c[i] = b[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
