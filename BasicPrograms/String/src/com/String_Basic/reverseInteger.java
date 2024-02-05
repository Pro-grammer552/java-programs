package com.String_Basic;

import java.util.Arrays;

public class reverseInteger {

	public static void main(String[] args) {

//		int a = -123;
		// -321
		// int c=1;
//		StringBuilder s = new StringBuilder();
//		s.append(Math.abs(a));
//		s.reverse();
//
//		System.out.println(s.toString());

//		if (a < 0) {
//			//s.insert(0, '-');
//			c=(-1*a);
//			
//			
//			System.out.println(c);
//		}
//		
		// System.out.println(s.toString());

		int arr[] = { 1, 3, 5, 8, 1 };
		Arrays.sort(arr);
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int j = 1;
		for (int i = 0; i < arr.length-1; i++) {

			sum = arr[i] + arr[j];

			//System.out.println(sum);
			if (sum > max) {
				max = sum;
			}
			j++;
		}

		System.out.println(max);

	}

}
