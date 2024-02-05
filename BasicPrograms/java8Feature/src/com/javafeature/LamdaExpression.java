package com.javafeature;

interface Drive {
	void drive();
}

interface printmsg {
	void display(String msg);
}

public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drive auto = () -> {
			System.out.println("Auto is driving");
		};
		auto.drive();

		printmsg p1 = (m) -> {
			System.out.println(m);
		};
		p1.display("HTML");

		printmsg p2 = m -> System.out.println(m);
		p2.display("java");
	}
}         nnnnn 