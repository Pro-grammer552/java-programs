package com.prep;

import java.util.Arrays;

public class UniqueElement {

	public static void main(String[] args) {
		int[] arr = {0, 0, 30, 40, 50, 50, 50};

		int arr1[] = new int[arr.length];
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (arr[i] != arr[j] && i != j) {
				arr1[i] = arr[i];
				flag = 1;
			}
			j++;

			System.out.println(arr1[i]);
		}
		if (flag==0) {
			System.out.println(Arrays.toString(arr1));
		}

	}

}