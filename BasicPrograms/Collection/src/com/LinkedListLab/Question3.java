package com.LinkedListLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Question3 {

	public static void main(String[] args) {

		LinkedList<String> lists = new LinkedList<>();
		LinkedList<String> lists2 = new LinkedList<>();

		lists.add("i love java programming");
		lists.add("hello everyBody");

		for (int j = 0; j < lists.size(); j++) {
			String words[] = lists.get(j).split(" ");

			String newString = "";
			for (int i = 0; i < words.length; i++) {
				if (i % 2 != 0) {
					newString += words[i] + " ";
				}
			}
			lists2.add(newString);

		}

		for (String s : lists2) {
			System.out.print(s);
		}
	}
}