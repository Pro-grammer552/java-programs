package com.Assignment53Q;

public class binarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 5, 6, 8, 5 };

		int target = 5;

		int start = 0;
		int end = arr.length-1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;

			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				System.out.println(arr[mid]+""+mid);
				break;
			}

		}

	}

}
