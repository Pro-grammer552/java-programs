package com.abstraction;

abstract class Shape {
	public abstract void calculateArea();

	public void displayShape() {
		System.out.println("This is a shape.");
	}
}

class circle extends Shape {

	public void calculateArea() {
		System.out.println("This is a Area.");
	}

}

public class AbstractionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new circle();
		s.calculateArea();
		
		s.displayShape();

	}

}
