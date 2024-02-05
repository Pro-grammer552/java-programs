package com.String_Basic;

public class PatternProgram2 {

	public static void PatternOne(String str) {
		System.out.print(str.charAt(0) + ".");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ') {

				System.out.print(str.charAt(i + 1) + ".");
			}

		}

	}
	

	

	public static void main(String[] args) {

		String str = "Sachin Ramesh Tendulakar";

		PatternOne(str);

	}

}
