package com.Stringassignmet40;

public class MergeStringAlternately {

	public static void main(String[] args) {
		String word1 = "ab";
		String word2 = "pqrs";
		StringBuilder sb = new StringBuilder();

		int maxLength = Integer.max(word1.length(), word2.length());
		System.out.println(maxLength);

		for (int i = 0; i < maxLength; i++) {

			sb.append(word1.charAt(i));

			sb.append(word2.charAt(i));

		}

		System.out.println(sb.toString());
	}
}