package com.prep;

import java.util.Arrays;

public class DecendingSorting {

	public static void main(String[] args) {

		int arr[] = {4, 5, 1, 3, 2};

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

					//System.out.println(temp);
				}
			}

		}
		System.out.println(Arrays.toString(arr));

	}

}