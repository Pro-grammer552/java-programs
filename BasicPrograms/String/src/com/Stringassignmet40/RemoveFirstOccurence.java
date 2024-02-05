package com.Stringassignmet40;

//29. Write a Java program to remove first occurrence of a character from string.

//Inda is my country is
public class RemoveFirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "india is my country is ";
		String s = str.toLowerCase();

		char tar = 'i';

		String newS = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == tar && count == 2) {
				count++;
				continue;

			}

			else if (ch == tar && count == 1) {
				count++;
//	                continue;
			} else if (ch == tar && count == 0) {
				count++;
			}
			newS = newS + ch;

		}

		System.out.println(newS);
	}

}
