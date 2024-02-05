package com.LinkedListLab;

import java.util.LinkedList;

public class Question1 {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(5674);
		list1.add(1234);
		list1.add(123);

		// System.out.println(list1);
		int sum = 0;

		for (int i = 0; i < list1.size(); i++) {

			int num = list1.get(i);
			// System.out.println(num);
			while (num > 0) {

				int rem = num % 10;
				sum = sum + rem;

				num = num / 10;

			}
			 System.out.println(sum);
			int s = 0;
			while (sum > 0) {

				int r = sum % 10;
				s = s + r;
				sum = sum / 10;

			}

			list2.add(s);
			// System.out.println(list1.get(i));
		}
		for (int x : list2) {

			System.out.println(x);
		}
	}

}
