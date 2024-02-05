package com.hasmapAssignment50;

import java.util.HashMap;
import java.util.Map;

/*
 * WAP to copy all of the mappings from the specified HashMap to another map.

 */

public class Question8 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		h.put(1, 1000);
		h.put(2, 2000);
		h.put(3, 3000);
		h.put(4, 4000);
		
		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		
		h1.putAll(h);

		for (Map.Entry<Integer, Integer> m : h1.entrySet()) {
			System.out.println(m.getValue());

		}
		
	}
	

}
