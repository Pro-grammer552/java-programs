package com.prep;

import java.util.Arrays;

public class Stringreplace {

	public static void main(String[] args) {
		//c e g a b
		
		char arr[]= {'a','c','e','y','z'};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='y' || arr[i]=='z')
			{
				arr[i]=(char)(arr[i]-24);
			}else
			{
				arr[i]=(char)(arr[i]+2);
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}
