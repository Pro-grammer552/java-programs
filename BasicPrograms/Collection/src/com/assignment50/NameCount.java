package com.assignment50;

import java.util.ArrayList;
import java.util.HashMap;

public class NameCount {

	public static void main(String[] args) {

		ArrayList<String> mp = new ArrayList<String>();

		mp.add("Suraj");
		mp.add("keshav");
		mp.add("sourabh");
		mp.add("sourabh");
		mp.add("Suraj");
		mp.add("subodh");
		mp.add("rushi");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String s : mp) {
			if (map.containsKey(s)) {

				int count = map.get(s);
				map.put(s, count + 1);
			} else {

				map.put(s, 1);
			}
		}
		System.out.println(map);
	}
}

//	for(
//
//	int i = 0;i<mp.size();i++)
//	{
//			int count = 1;
//			for (int j = 0; j < mp.size(); j++) {
//
//				if (mp.get(i).equals(mp.get(j)) && i != j) {
//					count++;
//				}
//			}
//			map.put(mp.get(i), count);
//		}
//
//		System.out.println(map);
