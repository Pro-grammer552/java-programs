package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SecondOccurence {

	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		TreeMap<Integer, Character> t = new TreeMap<>();
		String s = "success";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (m.containsKey(ch)) {
				m.put(ch, m.get(ch) + 1);
			} else {
				m.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			char c1 = entry.getKey();
			int count = entry.getValue();

			t.put(count, c1);
		}

		System.out.println(t);
	}
}
