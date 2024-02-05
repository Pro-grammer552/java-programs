package com.july24;

/*
 3.	Create interfaces Bike and Scooty, both of which have two methods- 
 offer() and details() (details() is default method). 
 Create a new class BuySomething which implements both interfaces.
  To remove ambiguity, create a method details() in BuySomething class 
 as well in which call the details() method of both interfaces.
  Call the methods of BuySomething class in main method.
 */

interface Bike {
	void offer();

	default void details() {
		System.out.println("Bike");
	}
}

interface Scooty {
	void offer();

	default void details() {
		System.out.println("Scooty");
	}
}

class BuySomething implements Bike, Scooty {
	@Override
	public void offer() {
		System.out.println("inside BuySomething");
	}

	@Override
	public void details() {
		Bike.super.details();
		Scooty.super.details();
	}
}

public class Buy_something {
	public static void main(String[] args) {
		BuySomething b = new BuySomething();
		b.offer();
		b.details();
	}
}
