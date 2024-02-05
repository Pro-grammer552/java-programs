package com.List;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOdd {

	public static void main(String[] args) {
		ArrayList<Integer> arr3 = new ArrayList<>();

		arr3.add(11);
		arr3.add(23);
		arr3.add(33);
		arr3.add(45);
		arr3.add(50);
		arr3.add(77);

		for (int i = 0; i < arr3.size(); i++) {
			if (arr3.get(i) % 2 != 0) {
				arr3.remove(i);
				i--;
			}

		}
		System.out.println(arr3);
		
		

//		Iterator<Integer>itr3=arr3.iterator();
//		
//		while(itr3.hasNext())
//		{
//			if(itr3.next()%2==1)
//			{
//				itr3.remove();
//			}
//			System.out.println(arr3);
//			
//		}
//		

	}

}
