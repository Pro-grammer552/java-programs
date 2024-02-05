package com.dd_array;

public class MaxRow {

	/*
	 * WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25,16}}
	 * output is: 31 and 25.
	 */
	public static void main(String[] args) {

		int[][] arr = { { 22, 31, 9 },
						{ 12, 25, 16 },
						{ 13, 28, 50 } };

		for (int i = 0; i < arr[0].length; i++) {

			int max1 = arr[0][i];   //

			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] > max1) {
					max1 = arr[j][i];
				}
			}

			System.out.println(max1);

		}

	}

}
