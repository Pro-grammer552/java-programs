package com.hotlist2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 create a Arraylist having names of fruits, 
 create a method to findout fruitname and
  list no.of times fruitname has repeated
//print the output in mainmethod
 */
public class frui {

	public static HashMap<String, Integer> findout(ArrayList<String> arr) {

		HashMap<String, Integer> h = new HashMap<String, Integer>();

		String f = "";

		for (int i = 0; i < arr.size(); i++) {
			int count = 1;
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(i).equals(arr.get(j)) && i != j) {
					count++;
					h.put(arr.get(i), count);

				}

			}

		}

		System.out.println(h);
		return h;
	}

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Apple");
		arr.add("Mango");
		arr.add("Apple");
		arr.add("Mango");
		arr.add("Apple");
		HashMap<String, Integer> s = findout(arr);

		// System.out.println(s);

	}

}
