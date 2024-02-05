package com.Assignment53Q;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 2, 4, 6, 7, 9, 10, 12 };
		missingnum(arr);
	}

	private static void missingnum(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		int i;
		for (i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];

			} else if (min > arr[i])
				min = arr[i];
		}
		// System.out.println(min);
		// System.out.println(max);

		for (i = min; i <= max; i++)

		{
			boolean found = false;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(i);
			}

		}
	}
}