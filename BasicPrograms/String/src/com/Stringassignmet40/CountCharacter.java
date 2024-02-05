package com.Stringassignmet40;

//. Write a Java program to find total number of 
//alphabets, digits or special character in a string

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World 123 !!#$";

		int alphacount=0;
		int digitcount=0;
		int specialcount=0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z' )|| (ch >= 'a' && ch <= 'z')) {
				alphacount++;
			}else if(ch>='0' && ch<='9')
			{
				digitcount++;
				
			}else if(ch==' ')
			{
				continue;
			}
			else
			{
				specialcount++;
				
			}

		}
		
		
		System.out.println("Alphabet Count :" +alphacount);
		System.out.println("Digit count : "+digitcount);
		System.out.println("Special character count : "+specialcount);

	}

}
