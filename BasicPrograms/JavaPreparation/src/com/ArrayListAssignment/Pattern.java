package com.ArrayListAssignment;

public class Pattern {
	/*
	 * A ABA ABCBA ABCDCBA ABCDEDCBA
	 */

	public static void main(String[] args) {
	    for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= 5 - i; j++) {
	            System.out.print(" "); // Print spaces
	        }
	        for (int j = 1; j <= i; j++) {
	            System.out.print("A"); // Print 'A' characters
	        }
	        System.out.println(); // Move to the next line
	    }
	}


}
