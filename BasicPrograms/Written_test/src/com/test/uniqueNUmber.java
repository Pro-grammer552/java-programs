package com.test;

public class uniqueNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 1, 2, 2, 3, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					count++;
				}

			}
			if (count == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
