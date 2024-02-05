package com.hasmapAssignment50;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterationExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		// Iterate over keys using keySet() and Iterator
		Set<Integer> keys = map.keySet();
		Iterator<Integer> iteratorKey = keys.iterator();

		while (iteratorKey.hasNext()) {
			Integer key = iteratorKey.next();
			System.out.println(key + " " + map.get(key));
			System.out.println("-----");
		}

		// Iterate over entries using entrySet() and Iterator
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> entrySetIterator = entrySet.iterator();

		while (entrySetIterator.hasNext()) {
			Map.Entry<Integer, String> entry = entrySetIterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("-----------------");

		// Example of iterating over a HashMap with String keys and values
		HashMap<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("A", "Apple");
		stringMap.put("B", "Banana");

		Set<String> stringKeys = stringMap.keySet();
		Iterator<String> stringIterator = stringKeys.iterator();

		while (stringIterator.hasNext()) {
			String stringKey = stringIterator.next();
			System.out.println(stringKey + " " + stringMap.get(stringKey));
		}

		System.out.println("------------------------");
		
		// Iterate over values using values() method and Iterator
		Iterator<String> valueIterator = map.values().iterator();

		while (valueIterator.hasNext()) {
			String value = valueIterator.next();
			System.out.println(value);
		}

	}
}
