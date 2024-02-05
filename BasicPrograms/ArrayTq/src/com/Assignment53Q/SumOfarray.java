package com.Assignment53Q;

public class SumOfarray {

	public static int FindSumArray(int arr[]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("sum :" + sum);

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = FindSumArray(arr);

	}

}
