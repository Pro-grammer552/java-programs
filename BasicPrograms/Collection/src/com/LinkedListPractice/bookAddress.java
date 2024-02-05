package com.LinkedListPractice;

import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class Book {

	int id;
	String name;
	int price;

	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class bookAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> listt = new ArrayList<>();
		listt.add(new Book(101, "code", 1000));
		listt.add(new Book(102, "code java", 1000));
		listt.add(new Book(108, "code java", 1000));
		listt.add(new Book(103, "code python", 3000));
		listt.add(new Book(104, "code javascript", 4000));
		listt.add(new Book(109, "code java", 3000));
		
		HashMap<Integer, String> kk=new HashMap<>();
		kk.ṭ(101, "ss");
		kk.put(102, "aa");
		kk.put(102, "aaa");
		
		System.out.println(kk);
		System.out.println(kk.put(102, "aa"));
//
//		for (int i = 0; i < listt.size(); i++) 
//		{
//
//			int count = 1;
//			boolean is=false;
//			for (int j =0; j < listt.size(); j++) 
//			{
//
//				if (listt.get(i).price == listt.get(j).price )
//				{
//					
//					is=true;
//					
//					count++;
//					
//
//				}
//
//			}
//
//			if (count==2)
//				System.out.println(listt.get(i));
//		}
	}

}
