package com.Stringassignmet40;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class GcdofString {

	public static void main(String[] args) {
		int num[] = { 3, 2, 4,3 };

		Map<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < num.length; i++) {
			int count = 1;

			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j] && i != j) {
					count++;
				}
			}

			if (!m.containsKey(num[i])) {
				m.put(count,num[i]);
			}
		}
		System.out.println(m);
		TreeMap<Integer,Integer>t=new TreeMap<Integer, Integer>(Collections.reverseOrder());
		t.putAll(m);
		 Entry<Integer, Integer> firstEntry = t.firstEntry();
		 int firstValue = firstEntry.getValue();
		 System.out.println(firstValue);
	
		
	}
}
