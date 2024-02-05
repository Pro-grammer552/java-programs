package com.Stringassignmet40;

public class QuestionNo1 {

	public static void main(String[] args) {
		
		String s1="Welcome";
		String s2="welcome";
		String s3=new String("Welcome");
		
		//System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));  //f //content comaprison
		
		
		System.out.println(s1.equals(s3));   //t //reference comparision
		System.out.println(s1.equals(s3));  //t //reference comparision
	}

}
