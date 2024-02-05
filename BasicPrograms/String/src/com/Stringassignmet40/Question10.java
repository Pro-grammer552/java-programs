package com.Stringassignmet40;

/*
  Write a Java program to find first occurrence of a character in a given string
 */

public class Question10 {

	public static void main(String[] args) {

		String s1 = "HEllOWORLD";
		char c='l';
		String s2 = s1.toLowerCase();
		
		int count = 0;

		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);

			if(c==s1.charAt(i))
			{
				System.out.println(c+" : "+i);
				break;
			}

			}
		}

	}


