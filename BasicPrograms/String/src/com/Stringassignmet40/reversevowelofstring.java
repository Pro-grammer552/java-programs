package com.Stringassignmet40;

import java.util.Stack;

public class reversevowelofstring {
	public static void main(String[] args) {
		String s = "hello";
		String res = "";

		Stack<Character> stack = new Stack<>();

		String vowels = "aeiouAEIOU";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (vowels.contains(String.valueOf(c)))
				stack.push(c);
		}
		
		
		System.out.println(stack);

		for (int i = 0; i < s.length(); i++) {
			char d = s.charAt(i);
			
			if (vowels.contains(String.valueOf(d))) {
			
				res = res+stack.pop();
				
			} else
				res =res+ d;
			
		}
		System.out.println(res);
	}
}