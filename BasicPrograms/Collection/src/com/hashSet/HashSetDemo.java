package com.hashSet;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(40);
		s.add(null);

		System.out.println(s);
		System.out.println("-------------------------");
		//ArrayList<Integer> arr = new ArrayList<Integer>(s);
		
		Vector<Integer>v=new Vector<Integer>(s);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
//
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}

		System.out.println("------------------------");

		for (Integer a : s) {
			System.out.println(a);
		}

		System.out.println("----------------------");
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}
}
