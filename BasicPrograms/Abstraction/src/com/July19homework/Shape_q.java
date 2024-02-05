package com.July19homework;


/*
 8.	Create shape class and show example of dynamic
  dispatching using child classes
 */


class Shape{
	
	public void Area() {
		System.out.println("Area Class");
	}
}
class Rectangless extends Shape{
	public void Area() {
		System.out.println("Rectangless Class");
	}
}
class Circle extends Shape{
	public void Area() {
		System.out.println("Circle Class");
	}
}
public class Shape_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangless();
		s.Area();

	}

}
