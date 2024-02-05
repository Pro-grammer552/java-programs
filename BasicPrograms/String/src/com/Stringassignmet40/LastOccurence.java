package com.Stringassignmet40;

public class LastOccurence {

	public static void main(String[] args) {
		String str = "india is my country is ";
		String s = str.toLowerCase();

		char tar = 'i';

		String newS = "";
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			char ch = s.charAt(i);

			if (ch == tar && count == 0) {
				count++;
				continue;

			}



		}

		System.out.println(newS);

	}

}
