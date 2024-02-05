package com.assignment50;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>();

		s.add("html java python css ruby");

		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("html css  javascript c# ruby");

		ArrayList<String> words = new ArrayList<>();
		ArrayList<String> words2 = new ArrayList<>();
		String[] p = s.get(0).split(" ");

		String[] p2 = s1.get(0).split(" ");

		for (String word1 : p) {

			boolean flag = false;
			for (String word2 : p2) {
				if (word1.equals(word2)) {

					flag = true;

				}

			}
			if (!flag) {
				words.add(word1);

			} else {
				words2.add(word1);

			}
		}
		System.out.println("Not duplicate \n" + words);
		System.out.println("Duplicate \n" + words2);
	}
}