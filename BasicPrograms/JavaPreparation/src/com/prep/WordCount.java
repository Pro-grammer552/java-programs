package com.prep;

import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {

		String arr[] = {"red", "white", "red", "white", "red","black"};

		HashMap<String, Integer> h = new HashMap<String, Integer>();

		for (String arr1 : arr) {
			if (h.containsKey(arr1)) {

				h.put(arr1, h.get(arr1) + 1);
			} else {
				h.put(arr1, 1);
			}
		}
		System.out.println(h);

	}
}