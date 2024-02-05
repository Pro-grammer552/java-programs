package com.hasmapAssignment50;

import java.util.HashMap;

/*
 WAP to add elements to a HashMap without using generics (ie do not use <>) and
  print content of it. Use Integer as Key and String as Value. 
  In second HashMap add elements of 
String type as Key and Integer as Value.

 */

public class Question1 {

	public static void main(String[] args) {
		HashMap h = new HashMap();

		h.put(1, "Suraj");

		HashMap h1 = new HashMap();
		h1.put("Suraj", 11);
		
		
		System.out.println(h);
		System.out.println(h1);

	}

}
