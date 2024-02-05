package com.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Suraj");
        arr.add("Subhod");
        arr.add("Rakesh");
        arr.add("Rushi");
        arr.add("Navin");
        arr.add("Keshav");
        arr.add("");
        arr.add("Suraj");
        arr.add("Abhi");
        arr.add("KK");

        arr.add("Suraj");
        arr.add("Abhi");
        arr.add("KK");

        System.out.println("--- Add new Element at index 2 ---");
        arr.add(2, "Raju");
        System.out.println("Size: " + arr.size());
        System.out.println(arr);

        System.out.println("---- Replace name ----");
        arr.set(1, "Suraj_yelmate");
        System.out.println("Size: " + arr.size());
        System.out.println(arr);

        System.out.println("-------------");
        System.out.println(arr);

        System.out.println("-------------- Index of 'Suraj' --------------");
        System.out.println(arr.indexOf("Suraj"));

        System.out.println("-------------- Last index of 'Suraj' --------------");
        System.out.println(arr.lastIndexOf("Suraj"));

        System.out.println("------ Contains 'Suraj' ------");
        System.out.println(arr.contains("Suraj"));
        
        System.out.println("-------------");
        System.out.println(arr);
        
        
        System.out.println("------------------------");
        
        
        Iterator<String>itr=arr.iterator() ;
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
			
        
        
    }
}
