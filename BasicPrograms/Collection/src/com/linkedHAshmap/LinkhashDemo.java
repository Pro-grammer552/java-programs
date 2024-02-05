package com.linkedHAshmap;

import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LinkhashDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put("ahree", "One");
		map.put("bwo", "Two");
		map.put("Ane", "Three");

		System.out.println(map);

		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.hashCode());

		
		TreeMap<String, String> m=new TreeMap<>(map);
		System.out.println(m);
		System.out.println(m.descendingKeySet());
		
		SortedMap<String, String>s=m.descendingMap();
		//TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());

		
		System.out.println(m.firstKey());
		System.out.println(m.lastKey());
		System.out.println(m.lastEntry());
		System.out.println(m.descendingKeySet());
		
		System.out.println("-----------------------------");
		
		System.out.println(m.headMap("ahree"));
		System.out.println(m.tailMap("bwo"));
		System.out.println(m.subMap("ahree", "Ane"));
		

	}

}
