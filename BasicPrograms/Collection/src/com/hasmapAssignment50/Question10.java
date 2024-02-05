package com.hasmapAssignment50;

import java.util.HashMap;

/*
 WAP to test if a HashMap contains a mapping for the specified key
 */
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		h.put(1, 1000);
		h.put(2, 2000);
		h.put(3, 3000);
		h.put(4, 4000);
		
		
		
		System.out.println(h.containsKey(1));
		
	}

}
