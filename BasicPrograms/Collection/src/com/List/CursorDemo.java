package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorDemo {

	public static void main(String[] args) {
		ArrayList<String> arr2 = new ArrayList<>();

		arr2.add("Suraj");
		arr2.add("Subhod");
		arr2.add("Rakesh");
		arr2.add("Rushi");
		arr2.add("Navin");
		arr2.add("Keshav");
		
		
		

		System.out.println("-----using Iterator----------");
		Iterator<String> itr = arr2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}

		System.out.println("--using ListIterator----------14");
		
		System.out.println("-------Forward--------");
		ListIterator<String> itr1 = arr2.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next() + " ");
		}
		System.out.println();

		System.out.println("-------------backward-------");

		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

	}

}
