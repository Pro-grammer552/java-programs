package com.Stringassignmet40;

/*
 * . Write a Java program to reverse order of words in a given string.

 */

public class ReverseWord {

    public static void main(String[] args) {
        String str = "I Love My India";
        String rev = "";
        String currentWord = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch= str.charAt(i);
            
           // System.out.println(ch);
            
            if (ch != ' ') {
                currentWord = ch + currentWord;
            } else {
                rev = rev + currentWord + ch;
                currentWord = "";
            }
        }

        // Append the last word
        rev = rev + currentWord;

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);
    }
}

