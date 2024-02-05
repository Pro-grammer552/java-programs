package com.july24;


/*
 1.	Write a program to create a interface  named shape.
  In this class we have three sub classes circle,
  triangle and square each class has two member function 
  named draw () and erase (). Create these using polymorphism concepts.
 */


interface Shape{
	void draw();
	void erase();
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw circle");
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erase circle");
	}
	
}
class Triangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw triangle");
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erase Triangle");
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Square");
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erase Square");
	}
	
}


public class Shape_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw();
		c.erase();
		Triangle t = new Triangle();
		t.draw();
		t.erase();
		Square s = new Square();
		s.draw();
		s.erase();

	}

}
