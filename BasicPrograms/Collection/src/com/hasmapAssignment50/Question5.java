package com.hasmapAssignment50;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 . WAP to get all the entries from a HashMap. 
 Iterate the entries and print the Key & Value 
values

 */

public class Question5 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		h.put(1, 1000);
		h.put(2, 2000);
		h.put(3, 3000);
		h.put(4, 4000);

		for (Map.Entry<Integer, Integer> m : h.entrySet()) {
			System.out.println(m.getValue());

		}
		System.out.println("--------------------------------------------");

		// using iterator

		Iterator<Map.Entry<Integer, Integer>> iterator = h.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			System.out.println(entry.getValue());
		}

	}
}
