package com.String_Basic;

import java.util.Arrays;

public class AdjustStringMain {

	public static void main(String[] args) {

		String[] s1 = { "I", "am", "ve" };

		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1[i].length(); j++) {
				count++;
			}
		}

		int alen = (count / s1.length) + 1;
		System.out.println(alen);

		StringBuilder s2 = new StringBuilder("");

		for (int i = 0; i < s1.length; i++) {
			s2.append(s1[i]);
		}
		System.out.println(s2);

		String[] arr = new String[s1.length];

		for (int i = 0; i < s1.length; i++) {
			int k = i * alen;
			System.out.println(k+"    kk");
			int end = Math.min(alen + k, s2.length());
			
			System.out.println(end+"            fff");
			
			arr[i] = s2.toString().substring(k, end);
			System.out.println(arr[i]+"    gg");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() != arr[j].length()) {
					arr[j] += "#";
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
