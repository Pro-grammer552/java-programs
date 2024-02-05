package com.String_Basic;


// store in a scp area 
public class StringIntern {

	public static void main(String[] args) {

		String s1 = new String("Abc");
		
		String s5=new String("Abc");

		String s2 = s1.intern();

		String s3 = "Abc";

		String s4 = s2.intern();

		System.out.println(s1 == s2); // f

		System.out.println(s3 == s4); // t
	
		System.out.println((s1.intern()==s5.intern())); //t
	}

}
