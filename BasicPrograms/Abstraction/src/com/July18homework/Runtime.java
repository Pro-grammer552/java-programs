package com.July18homework;

class Mobile {
	public  static void d () {
		System.out.println("Mobile");
	}
}

class Redmi extends Mobile {
	public static  void d () {
		System.out.println("Redmi");
	}
}

class Apple extends Mobile {
	public void d() {
		System.out.println("Apple");
	}
}
class Realme extends Mobile{
	public void d() {
		System.out.println("Real me");
	}
}

public class Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m1 = new Mobile();
		m1.d();
		Redmi r = new Redmi();
		r.d();
		Mobile m2 = new Apple();
		m2.d();
		m2 = new Realme();
		m2.d(); 
		main ( " " , 10);
		
	}
	public static void main ( String s , int a) {
		System.out.println("overload");
	}

}
