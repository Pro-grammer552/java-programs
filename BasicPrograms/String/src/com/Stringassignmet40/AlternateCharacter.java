package com.Stringassignmet40;

public class AlternateCharacter {

	public static void main(String[] args) {

		String s = "India is my country";

		// String word[]=s.split(" ");
		
		

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				continue;
			}

			else if (i % 2 == 0) {
				System.out.print(ch);
			}
		}
	}

}
