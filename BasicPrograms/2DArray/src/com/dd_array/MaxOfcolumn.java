package com.dd_array;

public class MaxOfcolumn {

	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 22, 31, 9 }, 
						{ 12, 5, 16 }, 
						{ 34, 42, 2 } };

		int row = 3;
		int col = 3;
		System.err.println("max" + "  " + "min");
		for (int i = 0; i < col; i++) {

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < row; j++) {

				// maxcol
				if (arr[j][i] > max) {

					max = arr[j][i];

				}

				// mincol
				if (arr[j][i] < min) {
					min = arr[j][i];
				}

			}

			System.err.print(max + "  " + min);

			System.out.println(" ");
		}

	}
}