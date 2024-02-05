package com.List;

import java.util.ArrayList;

//5.	Create arraylist of characters. 
//Remove duplicate characters from the list.
//E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}
//Output should be {‘d’ , ‘g’ , ‘h’}

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		ArrayList<Character> arr = new ArrayList<Character>();

		arr.add('d');
		arr.add('g');
		arr.add('h');
		arr.add('d');
		arr.add('h');
		arr.add('g');
		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {
			int count = 0;
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j)) {

					System.out.println(arr.get(i) + " " + count);
				} else {
					System.out.println(arr.get(i) + " " + count);
				}

			}

		}

	}

}
