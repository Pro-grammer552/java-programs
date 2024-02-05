package com.dd_array;

import java.util.Arrays;

public class ddArrayDemo1 {

	public static void main(String[] args) {

		int arr[][] = new int[2][2];

		System.out.println("Before insertion");

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		arr[0][0] = 20;
		arr[0][1] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;

		System.out.println("After insertion");

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.println("With for loop");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+"\t");
				
				
			}
			System.out.println();
		}
		
		System.out.println("------for each -------");
		for(int[] row: arr)
		{
			for(int col:row)
			{
				System.out.print(col+"\t");
			}
			System.out.println();
		}

	}

}
