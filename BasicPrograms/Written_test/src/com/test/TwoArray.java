package com.test;

import java.util.ArrayList;

public class TwoArray {

	public static void main(String[] args) {

		int arr[][] = { { 2, 4, 9, 7 },
						{ 6, 5, 3, 10 }, 
						{ 7, 3, 6, 4 } };
		ArrayList<Integer> a = new ArrayList<Integer>();

		int max = Integer.MIN_VALUE;
		for (int j = 0; j < arr[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {

				sum += arr[i][j];
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			int avg = sum / arr.length;
			System.out.println(sum);
			a.add(avg);
		}
		System.out.println(a);
		System.out.println(max);

	}

}
