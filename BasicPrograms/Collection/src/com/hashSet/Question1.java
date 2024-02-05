package com.hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(40);
		s.add(30);
		s.add(30);
		//Collections.sort(s);
		LinkedHashSet<Integer> hash = new LinkedHashSet<Integer>(s);
		
		System.out.println("------With hashet----" + hash);

		for (int i = 0; i < s.size(); i++) {
			for (int j = 0; j < s.size(); j++) {
				if (s.get(i) == s.get(j) && i != j) {
					// System.out.println(s.get(j));

					s.remove(s.get(j));
				}

			}
		}
		Collections.sort(s);
		System.out.println("------With logic----" + s);
	}

}
