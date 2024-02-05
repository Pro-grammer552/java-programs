package com.assignment50;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();

		arr.add("Suraj");
		arr.add("Subhod");
		arr.add("Rakesh");
		arr.add("Rushi");
		arr.add("Navin");
		arr.add("Keshav");

		String ar[] = new String[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			ar[i] = arr.get(i);

		}
		System.out.println(Arrays.toString(ar));

		System.out.println("--------------------------------------");
		ArrayList<String> arr1 = new ArrayList<>();
		for (int i = 0; i < ar.length; i++) {
			arr1.add(ar[i]);
		}
		System.out.println(arr);

	}
}
