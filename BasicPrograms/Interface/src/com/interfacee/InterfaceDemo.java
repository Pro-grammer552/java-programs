package com.interfacee;

public interface InterfaceDemo {

	int a = 6;

	void display(String name);
}

class Access implements InterfaceDemo {

	@Override
	public void display(String name) {
		System.out.println(name);
		System.out.println(InterfaceDemo.a);
	}
}

class Access1 implements InterfaceDemo {

	@Override
	public void display(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Access ac = new Access();
		ac.display("Harsh");

		InterfaceDemo i = new Access1();
		i.display("Harshal");
	}
}
