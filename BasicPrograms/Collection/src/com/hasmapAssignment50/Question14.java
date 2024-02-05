package com.hasmapAssignment50;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 *. WAP to empty Map. (Hint - Get keys and iterate through the keys 
 *to remove entries from  Map)
 */

public class Question14 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		h.put(1, 1000);
		h.put(2, 2000);
		h.put(3, 3000);
		h.put(4, 4000);

		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>(h);

		System.out.println(h1);

		for (Map.Entry<Integer, Integer> m : h.entrySet()) {
			h.remove(m.getKey());
			
			
		}
		System.out.println(h);

		
//		Iterator<Map.Entry<Integer, Integer>> iterator = h.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<Integer, Integer> entry = iterator.next();
//			iterator.remove(); // Safely remove using iterator
//		}

	}

}
