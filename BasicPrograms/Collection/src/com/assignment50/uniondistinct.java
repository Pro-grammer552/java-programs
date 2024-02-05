package com.assignment50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


//1 6 9 13 15 20 25 29 35 46

public class uniondistinct {

	public static void main(String[] args) {

		int arr2[] = {6 ,9 ,13 ,15, 20, 25, 29, 46 };
		int arr1[] = { 1 ,35 };
		

		HashSet<Integer> h = new HashSet<Integer>();
		ArrayList<Integer>aa=new ArrayList<Integer>();
		
		for (int a : arr1) {
			h.add(a);
		}
		for (int a : arr2) {
			h.add(a);
		}

		System.out.println(h);
		aa.addAll(h);
		Collections.sort(aa);
		System.out.println(aa);
		
		
		

	}

}
