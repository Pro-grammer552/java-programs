package com.hasmapAssignment50;

import java.util.HashMap;

/*
WAP to create a map using Wrapper class as key and value same as keys’ data type WAP to 
count the number of key-value (size) mappings in a map.
 */

public class Question4 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		
		h.put(1, 1000);
		h.put(2, 2000);
		h.put(3, 3000);
		h.put(4, 4000);

		int count=0;
		int i;
		for(i=0;i<h.size();i++)
		{
			count++;
			
		}
		
		
		System.out.println(count);

	}

}
