package com.Assignment53Q;

import java.util.Arrays;

public class Question22 {
	public static void reverseArray(int[] arr) {
		int[] tempArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];   //3,90,45,29,37,78
			
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = tempArr[arr.length - 1 - i];   //78,37,29,45,90,3  
			
			 
		}
	}

	public static void main(String[] args) {
		
		
		int[] arr = { 3, 90, 45, 29, 37, 78 };
		reverseArray(arr);

		System.out.println("Reverse Array" + Arrays.toString(arr));
	}
}
