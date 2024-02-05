package com.prep;

import java.util.Arrays;

public class AscendingDesending {

	public static void main(String[] args) {

		int arr[] = {4, 5, 3, 2, 6, 4};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		}
		System.out.println("Sorted Array :" + Arrays.toString(arr));
		int mid = arr.length / 2;

		for (int i = mid; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}
		}
		System.out.println("AsendingDecending Array :" +Arrays.toString(arr));

	}

}
