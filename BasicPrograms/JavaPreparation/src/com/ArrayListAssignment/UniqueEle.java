package com.ArrayListAssignment;

import java.util.ArrayList;

/*
 * 1.There is arraylist of strings al 
 * { “sun” , “mon” ,”sun” , “tue” , “wed” , “mon” }
Create another arraylist al2 which 
contains unique elements from al .So al2 will
be {“sun” , “mon” , “tue”, “wed” }.
 */
public class UniqueEle {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr1 = new ArrayList<String>();
		arr.add("mon");
		arr.add("sun");
		arr.add("tue");
		arr.add("mon");
		arr.add("mon");

		for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (!arr.get(i).equals(arr.get(j)) && !arr1.contains(arr.get(i))) {
                    arr1.add(arr.get(i));
                }
            }
        }

        System.out.println(arr1);
    }
}