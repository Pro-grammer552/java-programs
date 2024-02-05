package com.looselyTightCoupled;

//coupling : anything which bind together

//classese are independent on each other
// class A and class b   ,class A knows very well about class B;

interface Animal {
	public void sound();

}

class dog implements Animal {
	public void sound() {
		System.out.println("Dog Bark :");
	}
}

class Bird implements Animal {
	public void sound() {
		System.out.println("Bird sound :");
	}
}

public class LooselCouplig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new dog();
		a.sound();

	}

}
