package com.Stringassignmet40;

//. Write a Java program to find reverse of a string.

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I love My India";
		String rev="";
		
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			
			rev=ch+rev;
			
		}
		System.out.println(rev);
		
	}

}
