package com.innerClass;

public class Outer {
	int a = 50;
	int b = 60;

	public void show() {
		System.out.println("OUter");
	}

	public class Inner {

		int a = 10;
		int b = 20;

		public void display() {
			System.out.println("Inner");
		}

		public static void main(String[] args) {

			Outer ob=new Outer();
			ob.show();  //  call outer from inner class
			
			
		}

	}

	public static void main(String[] args) {

	
	
		
		Outer ob=new Outer();
		ob.show();  //outer
		
		System.out.println(ob.a);  //call outer class variable
		Outer.Inner oi=ob.new Inner();
		oi.display();  //inner
		
		
		Outer.Inner oii=new Outer().new Inner();
		oii.display();  //inner
		
		
	}

}
