package com.prep;

import java.util.Arrays;

public class NegativeEleSq {

	public static void number(int arr[]) {

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=arr[i-1]*arr[i-1];
			}
			
			
		}
		
	}

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, -1, 3, -5, 6};
		
		number(arr);
		System.out.println(Arrays.toString(arr));

	}

}