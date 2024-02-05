package com.Stringassignmet40;
// Write a Java program to replace first occurrence of 
// a character with another in a string.
public class ReplaceFirstOccurrence {
	public static void main(String[] args) {
		String input = "programming is fun";
		char oldChar = 'm';
		char newChar = 'z';
		
		char[] charArray = input.toCharArray();
        boolean found = false;	
        int count=1;
		
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == oldChar && count==0) {
                charArray[i] = newChar;
               count++;
            }
        }
        String result = "";
        for (char ch : charArray) {
            result += ch;
        }
        System.out.println("String after replacement: " + result);

	}

}
