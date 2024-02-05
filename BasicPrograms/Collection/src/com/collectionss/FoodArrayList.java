package com.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class FoodArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Food> list = new ArrayList<Food>();
		// Food f=new Food();
		list.add(new Food(104, "vada pav", 15));
		list.add(new Food(102, "dosa", 55));
		list.add(new Food(101, "Coffee", 30));
		list.add(new Food(103, "Tea", 10));
		list.add(new Food(106, "vada", 5));

		System.out.println(list);

//        Collections.sort(list,new Compareid());
//        System.out.println(list);
		Collections.sort(list, new CompareName());
		Iterator<Food> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Compareid implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getFoodid() - o2.getFoodid();
	}

}

class CompareName implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getFoodname().compareTo(o2.getFoodname());
	}

}

//class ComparePrice implements Comparator<Food>{
//
//	@Override
//	public int compare(Food o1, Food o2) {
//		// TODO Auto-generated method stub
//		return o1.getFoodprice()-o2.getFoodprice();
//	}
//	
//}