package com.prep;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// String a[]= {"c","c++","java"};
		int arr[] = {2, 3, 4, 5};

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println("max Number in Array :"+max);

		String b="c c++ java";
		String a[]=b.split(" ");
		//String a[] = {"c", "c++", "java"};

		String max1 = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i].length() > max1.length()) {
				max1 = a[i];
			}
		}
		System.out.println("MAx length word in array :" +max1);
	}

}