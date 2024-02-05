package com.dd_array;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rows, cols;
		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("Enter elements for the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter element for Ar[" + i + "][" + j + "]=");
				matrix[i][j] = sc.nextInt();
			}
		}

		int[][] transposeMatrix = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}

		System.out.println("Original Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nTranspose of the matrix:");
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}


	}
}
