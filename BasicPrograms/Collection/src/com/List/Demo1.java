package com.List;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<Object> arr = new ArrayList<>();

		System.out.println(arr);

		arr.add(10);
		arr.add("Suraj");
		arr.add(52.25);
		arr.add(true);
		arr.add('S');

		System.out.println(arr);
		System.out.println(arr.get(1));
		
		
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
		
		for(Object a:arr)
		{
			System.out.println(a);
		}
		
	}
}
