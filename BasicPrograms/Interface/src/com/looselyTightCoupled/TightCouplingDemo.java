package com.looselyTightCoupled;

//class A and class B , class A knows Very well know about Class B
class Teacher {

	TightCouplingDemo t = new TightCouplingDemo();

	public void Reading() {
		t.watching();
	}
}

public class TightCouplingDemo {

	public void watching() {
		System.out.println("This is tight Coupling.....");
	}

	public static void main(String[] args) {
		Teacher tt = new Teacher();
		tt.Reading();
	}

}
