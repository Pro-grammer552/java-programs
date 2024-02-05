package com.List;

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
		System.out.println("---Original ArrayList------\n");
		System.out.println(arr);

		System.out.println("-----//case-1----------\n");
		Object strarr[] = arr.toArray();
		System.out.println(arr);

		for (Object s : strarr) {
			System.out.println(s);
		}

		System.out.println("-----//case-2----------\n");
		String arr1[] = new String[arr.size()];
		arr1 = arr.toArray(arr1);
		for (String s1 : arr1) {
			System.out.println(s1);
		}
		
		System.out.println("-----//case-3----------\n");

		String str[] = new String[arr.size()];
		str = arr.toArray(str);
		for (int i = 0; i < arr.size(); i++) {
			str[i] = arr.get(i);

		}
		System.out.println(Arrays.toString(str));
	}

}
