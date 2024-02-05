package com.LinkedListLab;

import java.util.LinkedList;

public class Question4 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(123);
		list1.add(1245);
		list1.add(1246);

		System.out.print(list1);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list1.size(); i++) {
			int c = list1.get(i);

			if (c > max) {
				max = c;
				// System.out.println(max);
			}

			if (c < min) {
				min = c;
				// System.out.println(min);
			}

		}

		System.out.println();
		System.out.println("largest" + "\n" + max + "\n" + "Smalleset" + "\n" + min);
	}

}
