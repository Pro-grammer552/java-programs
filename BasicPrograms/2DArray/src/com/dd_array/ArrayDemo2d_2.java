package com.dd_array;

import java.util.Scanner;

public class ArrayDemo2d_2 {

	public static void main(String[] args) {

		int[][] Ar = new int[3][3];

		Scanner sc = new Scanner(System.in);
		int i, j, rows, cols;
		System.out.println("Enter no.of Rows");
		rows = sc.nextInt();
		System.out.println("Enter the no.of cols");
		cols = sc.nextInt();

		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				System.out.print("Enter element for Ar[" + i + "][" + j + "]=");
				Ar[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("-------2D Array----");
		
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				System.out.print(Ar[i][j]+"\t");
		
			}
			System.out.println();
		}
		
		
		

	}

}
