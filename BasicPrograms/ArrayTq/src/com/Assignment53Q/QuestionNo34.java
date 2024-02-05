package com.Assignment53Q;
/*
 34.WAP to find min character in character array.
  Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], so min character is ‘A’. 
 */

public class QuestionNo34 {

	public static void main(String[] args) {
		char[] arr = { 'A', 'D', 'a', 'x', 'z', 'R' };

		char minChar = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minChar) {
				minChar = arr[i];
			}
			
		//System.out.println((char)i+65);
		}
				System.out.println(minChar);

		
	}
}
