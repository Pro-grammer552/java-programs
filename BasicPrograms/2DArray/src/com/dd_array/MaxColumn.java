package com.dd_array;

public class MaxColumn {

	public static void main(String[] args) {
		int[][] arr = { { 1, 10, 3 }, { 9, 2, 5 }};
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int max = arr[0][0];
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[j][i] > max) {
					max = arr[j][i];
				}
			}

			System.out.println(max);
		}

	}
}