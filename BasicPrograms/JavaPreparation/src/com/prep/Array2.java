package com.prep;

import java.util.Arrays;

public class Array2 {
//even-0
	//odd-1
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,7};
		//int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				arr[i]=1;
			}else
			{
				arr[i]=0;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
