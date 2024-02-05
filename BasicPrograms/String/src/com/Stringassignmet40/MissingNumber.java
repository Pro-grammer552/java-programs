package com.Stringassignmet40;

import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 4, 5, 7 };
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(i)) {
				continue;
			} else {
				System.out.println(i);
			}

		}

	}
}
