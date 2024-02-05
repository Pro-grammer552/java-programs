package com.dd_array;

import java.util.Scanner;

public class SumOfMatrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows, cols;

		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		cols = sc.nextInt();
		int i, j;
		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] resultMatrix = new int[rows][cols];

		System.out.println("Enter elements for the first matrix:");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {

				System.out.print("Enter element for matrix1[" + i + "][" + j + "]=");
				matrix1[i][j] = sc.nextInt();
				System.out.print("Enter element for matrix2[" + i + "][" + j + "]: ");
				matrix2[i][j] = sc.nextInt();

				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

			}
		}

		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				System.out.print(resultMatrix[i][j] + "\t");

			}
			System.out.println();
		}

	}

}
