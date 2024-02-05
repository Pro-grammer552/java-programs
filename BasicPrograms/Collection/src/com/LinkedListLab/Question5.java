package com.LinkedListLab;

import java.util.LinkedList;

//first occurence

public class Question5 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Suraj");
		list.add("Suraj");
		list.add("Subhodh");
		list.add("Keshav");
		list.add("Suraj");

		for (String s : list) {
			System.out.println(s + " " + (list.indexOf(s)));
		}
		System.out.println("--------------------------");

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j)))

				{
					count++;
					System.out.println(count);
				}
			}

			if (count >= 1) {
				// list.removeLastOccurrence(list.get(i));
				// list.removeFirstOccurrence(list.get(i));
			}

		}
		System.out.println("--------------------------");

		for (String s : list) {
			System.out.println(s + " " + (list.indexOf(s)));
		}

		System.out.println("---------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " " + i);
		}
	}

}
