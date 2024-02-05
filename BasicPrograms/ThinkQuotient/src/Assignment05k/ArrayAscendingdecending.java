package Assignment05k;

import java.util.Arrays;

public class ArrayAscendingdecending {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 6, 7, 8, 9,10 };
		int arr1[] = new int[7];

		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr.length / 2 - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = arr.length / 2; i < arr.length; i++) {
			for (int j = arr.length / 2; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}

		System.out.println(Arrays.toString(arr1));
	}
}