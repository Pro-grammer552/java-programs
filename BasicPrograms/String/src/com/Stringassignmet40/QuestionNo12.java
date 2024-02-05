package com.Stringassignmet40;

public class QuestionNo12 {

	public static void main(String[] args) {
		String s = " HEllo World  ";
		String s1 = s.toLowerCase();

		System.out.println(s1.length());
		
		
		System.out.println(s1.trim());   // remove first and last spaces 
		System.out.println(s1.trim().length());
		
		System.out.println(s1+"h");
		System.out.println(s1.stripLeading());      //remove first spaces
 		System.out.println(s1.stripTrailing() +"h");  //remove last spaces
		//System.out.println();
	}

}
