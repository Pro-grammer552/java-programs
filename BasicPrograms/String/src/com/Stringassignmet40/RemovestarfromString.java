package com.Stringassignmet40;

import java.util.Stack;

public class RemovestarfromString {

	public static void main(String[] args) {

		String s = "leet**cod*e";
		// String s = "erase*****";

		// []
		// Output: "lecoe"
		Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (c != '*') {
				stack.push(c);

			} else {
				stack.pop();

			}
		}
		   StringBuilder sb = new StringBuilder();
	        while (!stack.isEmpty()) {
	            sb.insert(0, stack.pop());
	        }

	        String result = sb.toString();
	        System.out.println(result);
	}

}
