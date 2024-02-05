package com.Stringassignmet40;

import java.util.*;

public class uncommonInBoth {

	public static void main(String[] args) {
		String A = "characters";
		String B = "alphabets";
		List<Character> uncommonList = new ArrayList<>();
		char[] chA = A.toCharArray();
		char[] chB = B.toCharArray();
		HashSet<Character> un = new HashSet<>();

		for (int i = 0; i < A.length(); i++) {
			boolean isCommon = false;

			for (int j = 0; j < B.length(); j++) {
				if (chA[i] == chB[j]) {
					isCommon = true;
					break;
				}
			}

			if (!isCommon) {
				un.add(chA[i]);
			}
		}

		for (int i = 0; i < B.length(); i++) {
			boolean isCommon = false;

			for (int j = 0; j < A.length(); j++) {
				if (chB[i] == chA[j]) {
					isCommon = true;
					break;
				}
			}

			if (!isCommon) {
				un.add(chB[i]);
			}
		}

		uncommonList.addAll(un);
		Collections.sort(uncommonList);

		StringBuilder uncommon = new StringBuilder();
		for (Character c : uncommonList) {
			uncommon.append(c);
		}
		String uncommonString = uncommon.toString();
		System.out.println(uncommonString);
	}
}
