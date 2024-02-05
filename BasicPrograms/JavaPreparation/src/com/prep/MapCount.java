package com.prep;

import java.util.HashMap;
import java.util.Map;

public class MapCount {

	public static void main(String[] args) {
		HashMap<Integer, Character> old = new HashMap<Integer, Character>();
		HashMap<Character, Integer> ne = new HashMap<Character, Integer>();

		old.put(1, 'a');
		old.put(2, 'a');
		old.put(3, 'b');

		for (Map.Entry<Integer, Character> entry : old.entrySet()) {
			Character ch = entry.getValue();
			if (ne.containsKey(ch)) {
				ne.put(ch, ne.get(ch) + 1);

			} else {
				ne.put(ch, 1);
			}
		}

		System.out.println(ne);
	}

}
