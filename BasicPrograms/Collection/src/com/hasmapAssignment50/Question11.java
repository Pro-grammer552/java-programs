package com.hasmapAssignment50;

import java.util.HashMap;
import java.util.Map;

/*
 * WAP to search for an element from HashMap using key
 */

public class Question11 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		h.put(1, 1000);
		h.put(2, 2000);
		h.put(3, 3000);
		h.put(4, 4000);

		Integer search = 3;

		// System.out.println(h.containsValue(search));

		if (h.containsKey(search)) {
			for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
				if (entry.getKey() == (search)) {
					System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
				}

			}

		}
	}
}
