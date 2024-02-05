package com.Stringassignmet40;

import java.util.Arrays;

public class maxcharacterString {

	public static void main(String[] args) {
		String s = "this is a javaa";

		String word[] = s.split(" ");
		System.out.println(Arrays.toString(word));
		String l = "";
//		for (String words : word) {
//			if (words.length() > l.length()) {
//				l = words;
//			}
//		}

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > l.length()) {
				l = word[i];
			}

		}

		int count = 0;

		String a = "";
		for (int i = 0; i < l.length(); i++) {
			a = l.trim();
			char ch = a.charAt(i);
			count++;
		}
		System.out.println(count);
		System.out.println((a));

	}
}