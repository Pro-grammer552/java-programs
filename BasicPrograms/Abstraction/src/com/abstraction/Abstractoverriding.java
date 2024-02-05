package com.abstraction;

abstract class Animal {
	int a;

	public abstract void msg();

	public void display() {
		System.out.println("inside animal");
	}

}

abstract class Lion extends Animal {
	public abstract void msg();
}

class dog extends Lion {
	public void msg() {
		System.out.println("inside dog class");
	}

	public dog() {

	}
}



public class Abstractoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal a = new Animal();
		Animal a = new dog();
		a.msg();
		a.display();

		dog d = new dog();
		d.display();
		d.msg();
	}
}