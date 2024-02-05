package com.String_Basic;

import java.util.Arrays;
import java.util.HashMap;

public class countNUmber {

	public static void main(String[] args) {

		String s = "vedant is good boy vedant is handsome boy vedant";
		String a = "a";
		String b = "aab";
		String word[] = s.split(" ");
		System.out.println(Arrays.toString(word));

	
	
		//System.out.println(l);

		HashMap<String, Integer> m = new HashMap<String, Integer>();
		

		for (String words : word) {
			if (m.containsKey(words)) {
				m.put(words, m.get(words) + 1);
			} else {
				m.put(words, 1);
			}
		}

		for (String words : m.keySet()) {
			int count = m.get(words);
			System.out.println(words + " " + count);
		}

	}
}