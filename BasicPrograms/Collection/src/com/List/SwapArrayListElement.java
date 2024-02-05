package com.List;

import java.util.ArrayList;

//22.	WAP of swap two elements in an ArrayList

public class SwapArrayListElement {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(10);
		arr.add(11);
//		arr.add(12);
//		arr.add(13);
//		arr.add(14);

		System.out.println(arr);

		int index1 = arr.get(0);
		int index2 = arr.get(1);

		int temp = index1;
		arr.set(0, index2);
		arr.set(1, temp);

		System.out.println(arr);

	}

}
