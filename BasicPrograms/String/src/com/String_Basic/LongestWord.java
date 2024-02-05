package com.String_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestWord {

	public static void main(String[] args) {
		String s = "i love javaa";
		String ss="java";
	
		
		ArrayList<Character> hh = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
		    char ch = s.charAt(i);
		    hh.add(ch);
		}
	    
	  
		
		StringBuilder sb=new StringBuilder(s);
	
		
		s.replaceAll("\\s+", "");
		
		s.equalsIgnoreCase(s);
			
		System.out.println();
   System.out.println(s);
		String word[] = s.split(" ");

		String max = word[0];
		for (int i = 0; i < word.length; i++) {
			if (max.length() < word[i].length()) {
				max = word[i];
			}

		}
		System.out.println(max);

	}
}
