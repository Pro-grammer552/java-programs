package com.hasmapAssignment50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashmaptoArrayList {

	public static void main(String[] args) {

		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		h.put(1, 1000);
		h.put(2, 2000);
		h.put(3, 3000);
		h.put(4, 4000);

		ArrayList<Map.Entry<Integer, Integer>> a = new ArrayList<Map.Entry<Integer, Integer>>();

		for (Map.Entry<Integer, Integer> aa : h.entrySet()) {
			
			a.add(aa);
//			System.out.println(aa);
		}

		System.out.println(a);

	}

}
