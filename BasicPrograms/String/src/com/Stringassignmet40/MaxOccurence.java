package com.Stringassignmet40;

import java.util.HashMap;

public class MaxOccurence {

	public static void main(String[] args) {
		String s = "testsample";
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			char ch = s.charAt(i);

			for (int j = 0; j < i; j++) {
				if (ch == s.charAt(j)) {
					count++;
				}
			}

			h.put(ch, count);
		}

		
		System.out.println(h);
	}
}
