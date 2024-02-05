package com.Assignment53Q;

public class SumOfArray2nd_4Th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 7, 5 };
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i < arr.length; i++) {

			sum += arr[i];

			System.out.println(sum);

			sum2 = sum - arr[arr.length - 1];

		}
		System.out.println(sum2 + " " + arr[arr.length - 2]);

	}

}
