package com.hasmapAssignment50;

import java.util.HashMap;

/*
 . WAP add elements to HashMap without using generics, 0th location 
 use String as key and 
Integer as value, on 1st location use String as key String and Integer as value.

 */

public class Question2 {

	public static void main(String[] args) {

		HashMap hash = new HashMap();

		hash.put(0, "Suraj");
		hash.put("Suraj", 0);

		System.out.println(hash);

	}

}
