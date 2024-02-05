package com.String_Basic;

public class CountWords {

	public static void main(String[] args) {
		String str="I love gfh My  India";
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			
			if(str.charAt(i)==' ' && str.charAt(i+1)!= ' ')
			{
				count++;
				
			}
			
			
		}
		System.out.println(count+1);
		

	}

}
