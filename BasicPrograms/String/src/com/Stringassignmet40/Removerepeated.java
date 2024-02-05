package com.Stringassignmet40;

//Write a Java program to remove all repeated characters from a given string

public class Removerepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "india is my country india is my nation";
		String words[] = s.split(" ");
		
		for (int i = 0; i < words.length; i++) {
            int count = 0;
            
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                   // System.out.println(words[i]);
                    break;
                }
            }
            
            if (count == 0) {
                System.out.print(words[i]+" ");
            }
        }
    }
}