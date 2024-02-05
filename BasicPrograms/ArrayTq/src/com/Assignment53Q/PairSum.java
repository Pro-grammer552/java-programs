package com.Assignment53Q;

public class PairSum {

	public static void main(String[] args) {
		int[] array = { 2, 3, 1, 4, 7, 8, 14, 4 };
		int Sum = 5;

		System.out.println("Pairs with sum " + Sum + " in the array:");
		PairsWithSum(array, Sum);
	}

	public static void PairsWithSum(int[] arr, int Sum) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] + arr[j] == Sum) {
					System.out.println(arr[i] + ", " + arr[j]);
				}
			}
		}
	}
}
