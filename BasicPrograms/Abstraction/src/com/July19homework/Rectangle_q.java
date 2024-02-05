/*
 6.	Create a class ‘rectangle’ that contains ‘length’ and ‘width’ as data members.
  From this class derive a class named ‘box’ that has additional data member ‘depth’. 
  The members of the class ‘rectangle’ should consists of a constructor and a method area().
  The ‘box’ should have a constructor. Write a program to implement this.
 */


package com.July19homework;

class Rectangle{
	int length;
	int width;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public void area() {
		System.out.println("Area of Rectangle is :"+(length*width));
	}
}
class Box extends Rectangle{
	int depth;
	Box(int length,int width,int depth){
		super(length,width);
		this.depth=depth;
	}
	
	public void area() {
		super.area();
		System.out.println("Area of Box is :"+(length*width*depth));
	}
	
}

public class Rectangle_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Box b =new Box(2,4,5);
           b.area();
           
	}

}
