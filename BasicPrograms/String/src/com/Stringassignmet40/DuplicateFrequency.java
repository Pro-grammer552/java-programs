package com.Stringassignmet40;

//Duplicate words
//frequency  of words

public class DuplicateFrequency {

	public static void duplicate(String s) {
		String[] words = s.split(" ");

		System.out.println("Duplicate words:");

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					System.out.println(words[i]);

				}
			}
		}
	}

	public static void frequency(String s) {
		String[] words = s.split(" ");

		System.out.println("--------------Word frequencies:----------");
		for (int i = 0; i < words.length; i++) {
			if (words[i] == null) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[j] != null && words[i].equals(words[j])) {
					count++;
					// words[j] = null;
				}
			}

			System.out.println(words[i] + ": " + count);
		}
	}

	public static void main(String[] args) {
		String str = "I am Happy beacause i saw the other are Happy beacause";
		String s = str.toLowerCase();

		duplicate(s);
		frequency(s);
	}
}
