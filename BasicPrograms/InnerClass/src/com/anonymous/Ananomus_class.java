package com.anonymous;

abstract class animal{
	 abstract void eat();
}

public class Ananomus_class {

	public static void main(String[] args) {
		

		new animal() {
			public void eat() {
				System.out.println("Eat");
			}
		}.eat();
		
		animal dog = new animal() {
			public void eat() {
				System.out.println("Dog");
			}
		};
		dog.eat();
	}

}