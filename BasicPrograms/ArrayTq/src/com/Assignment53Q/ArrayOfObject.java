package com.Assignment53Q;

class Food{
	int id;
	String name;
	int price;
	
	Food (int id , String name , int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "id:"+id+"name:"+name+"price:"+price;
	}
}

public class ArrayOfObject
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food foods[] = new Food[4];
		foods[0] = new Food (101,"Gulab-jamun",100);
		foods[1] = new Food (102,"Pani Puri",50);
		foods[2] = new Food (101,"Dhokla",40);
		foods[3] = new Food (101,"Dosa",200);
		
//		for ( int i = 0 ; i<foods.length ; i++) {
//			System.out.println(foods[i]);
//		}
		for ( Food x : foods) {
			System.out.println(x);
		}
	
	}

}