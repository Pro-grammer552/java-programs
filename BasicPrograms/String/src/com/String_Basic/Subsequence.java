package com.String_Basic;

public class Subsequence {

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		int i = 0;
		int j = 0;

		for (i = 0; i < s.length(); i++) {
			for (j = 0; j < t.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j))
				{
					i++;
					j++;
				}

			}
			System.out.println();

		}
	}
}
