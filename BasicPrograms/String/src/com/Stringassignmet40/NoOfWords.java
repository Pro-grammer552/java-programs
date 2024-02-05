package com.Stringassignmet40;

import java.util.Arrays;

public class NoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am Happy beacause i saw the other are Happy beacause";
		String s = str.toLowerCase();

		String words[] = s.split(" ");
		//System.out.println(Arrays.toString(words));
		int count = 1;
		for (int i = 0; i < words.length; i++) {
			if (words[i] == null) {
				continue;
			}
			count++;

		}
		System.out.println("No of Words ::" + count);
		System.out.println(words.length);

	}

}
