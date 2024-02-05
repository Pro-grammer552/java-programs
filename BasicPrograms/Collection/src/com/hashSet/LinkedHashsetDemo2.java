package com.hashSet;

import java.util.*;

///hashmap using set interface

public class LinkedHashsetDemo2 {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "subodh");
		m.put(102, "Suraj");
		m.put(103, null);
		System.out.println(m);
		Set<Integer> s = m.keySet();
		System.out.println(s);

		Set<Integer> s1 = m.keySet();
		for (Integer r : s1) {
			System.out.println(r + " " + m.get(r));
		}

		Set<Map.Entry<Integer, String>> s2 = m.entrySet();
		System.out.println(s2);

	}

}
