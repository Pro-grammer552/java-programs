package com.Stringassignmet40;

/*
Write a Java program to count occurrences of a character in given string.

 */
public class QuestionNo11 {

	public static void main(String[] args) {

		String s = "HElloWorld";
		String s1 = s.toLowerCase();

		for (int i = 0; i < s1.length(); i++) {
			boolean isVisited = false;
			int count = 1;
			char ch = s1.charAt(i);
			for (int j = i + 1; j < s1.length(); j++) {

				if (ch == s1.charAt(j)) {
					count++;

				}

			}
			for (int k = 0; k < i; k++) {
				if (ch == s1.charAt(k)) {
					isVisited = true;
				}

			}
			if (!isVisited) {
				System.out.println(s1.charAt(i) + " " + count);
			}

		}

	}
}