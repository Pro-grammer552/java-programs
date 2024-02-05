package com.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();

		arr.add("Suraj");
		arr.add("Subhod");
		arr.add("Rakesh");
		arr.add("Rushi");
		arr.add("Navin");
		arr.add("Keshav");
		System.out.println("---Original ArrayList------\n");
		System.out.println(arr);

		System.out.println("-----//case-1----------\n");

		String[] str = { "Suraj", "Subhodh", "Keshav" };
		List<String> arrList = Arrays.asList(str);
		System.out.println(arrList);

		System.out.println("--------// case2-------\n");

		List<String> nlist = new ArrayList<String>();
		Collections.addAll(nlist, str);
		System.out.println(nlist);
		
		
		System.out.println("--------// case3-------\n");
	

	        List<String> List = new ArrayList<>();
	        for (String s : str) {
	            List.add(s);
	        }
	        System.out.println(List);
	}

}
