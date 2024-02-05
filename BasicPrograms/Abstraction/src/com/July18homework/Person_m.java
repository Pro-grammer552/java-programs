package com.July18homework;

class Person {
	public void readScript() {
		System.out.println("Inside Person class");
	}
}
class Actor extends Person {
	public void readScript() {
		System.out.println("Inside Actor class");
	}
}

public class Person_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Actor a = new Actor();
		a.readScript();
	}

}
