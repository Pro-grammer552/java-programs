package com.Assignment53Q;

public class MaximumNumber {

	public static void main(String[] args) {

		int a[] = { 12, 24, 65, 55 };
		
		int len = a.length;

		int max = a[0];
		int max2 = 0;
		
		for (int i = 1; i<a.length;i++) {
			if ( max < a[i]) {
		
				max2 = max;
				max = a[i];
			}else
				max2 = max;
		}
		System.out.println(max2);
		System.out.println(max);

	}
}
