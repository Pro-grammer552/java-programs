package com.singlton;

//Early instatitation

//object will call at the starting only

class Food {

	private static Food food = new Food();

	public static Food getfood() {
		return food;
	}
}

public class TestsingltonDemo2 {

	public static void main(String[] args) {
		Food obj1 = Food.getfood();
		Food obj2 = Food.getfood();

		System.out.println(obj1.hashCode());

		System.out.println(obj2.hashCode());
	}

}
