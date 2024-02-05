package com.TreeSet;

import java.util.*;

public class TreeSet_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> list = new TreeSet<Integer>();
		list.add(10);
		list.add(15);
		list.add(32);
		list.add(35);
		list.add(20);
		list.add(22);
		System.out.println(list);

		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);
//		System.out.println(list.descendingSet().pollLast());

		System.out.println(list.headSet(32));
		System.out.println(list.tailSet(20));

	}

}
