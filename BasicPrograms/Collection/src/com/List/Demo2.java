package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo2 {

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
		System.out.println("---sort in Acsending Order----\n");
		Collections.sort(arr);
		System.out.println(arr);

		System.out.println("---reverse----\n");

		Collections.reverse(arr);
		System.out.println(arr);

		System.out.println("---shuffle Array---\n");
		Collections.shuffle(arr);
		System.out.println(arr);

	
	}
}
