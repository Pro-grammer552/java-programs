package com.assignment50;

import java.text.NumberFormat;
import java.util.ArrayList;

//1.	WAP to add elements to arraylist without using
//generics (no <>) and print content of it where Integer is used.
//In second arraylist String is used.

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList();

		arr.add(10);
		arr.add(200);
		arr.add("Suraj");
		arr.add(52.25);
		arr.add(true);
		arr.add('S');

		for (Object o : arr) {
			if (o instanceof Number) {
				System.out.println(o);
			}
		}

	}

}
