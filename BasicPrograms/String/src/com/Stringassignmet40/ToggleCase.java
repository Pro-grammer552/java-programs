package com.Stringassignmet40;

import java.io.CharArrayReader;

//Write a Java program to toggle case of each character of a string.

public class ToggleCase {

	public static void main(String[] args) {

		String str = "HappY BirthDay To You";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 32);    //65+32=97

			} else if (c >= 'a' && c <= 'z') {
				c = (char) (c - 32);   
			}
			ch[i] = c;
		}

		String toggleString = new String(ch);

		System.out.println(toggleString);

	}

}
