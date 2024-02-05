package com.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();

		s.add(40);
		s.add(20);
		s.add(30);
		s.add(10);
		// s.add(32);
		s.add(30);

		s.add(null);

		System.out.println(s);

		for (Integer a : s) {
			System.out.println(a);
		}

	}

}
