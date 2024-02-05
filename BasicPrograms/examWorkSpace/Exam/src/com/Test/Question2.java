package com.Test;

public class Question2 {

	public static void main(String[] args) {
		// String s1="java";
		String s1 = "zbyc";

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

//			if (ch == s1.charAt(i) && ch != 'z' && ch != 'y') {
//				ch = (char) (ch + 2);
//
//			} else {
//				ch = (char) (ch - 24);
//			}
//			
			if (ch == 'z' || ch == 'y') {
				ch = (char) (ch - 24);
			} else {

				ch = (char) (ch + 2);
			}

			System.out.print(ch);
		}

	}

}
