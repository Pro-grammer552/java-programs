package com.prep;

import java.util.Arrays;

public class RotateArray2 {

	public static void main(String[] args) {
		int k = 2;
		int arr[] = {1, 2, 3, 4, 5, 6};

//		for (int j = 0; j < k; j++) {
//			int temp = arr[arr.length - 1];
//
//			for (int i = arr.length - 1; i > 0; i--) {
//
//				arr[i] = arr[i - 1];
//
//			}
//			arr[0] = temp;
//			System.out.println(Arrays.toString(arr));
//		}
//		
		
		
		 for (int j = 0; j < k; j++) {
	            int temp = arr[0];

	            for (int i = 0; i < arr.length - 1; i++) {
	                arr[i] = arr[i + 1];
	            }
	            arr[arr.length - 1] = temp;
	            System.out.println(Arrays.toString(arr));
	        }
	    		
		
	}

}
