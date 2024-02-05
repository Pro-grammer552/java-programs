package com.prep;

import java.util.Arrays;

public class perfectSquare {

	public static void main(String[] args) {

		int arr[] = {1, 2, 4, 16, 5,9};
		int arr1[] = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
		//	int sq = (int) Math.sqrt(arr[i]);
		
			int sq=arr[i]/2;
		
			if (sq * sq == arr[i]) {
				arr1[index] = arr[i];
			}
			index++;
		}

		System.out.println(Arrays.toString(arr1));
	}

}
