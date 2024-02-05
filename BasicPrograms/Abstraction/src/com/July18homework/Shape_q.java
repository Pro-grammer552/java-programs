package com.July18homework;

class Shape {

	public void draw () {
		System.out.println("Shape class");
	}
}
class circle extends Shape {
	@Override
	public void draw () {
		
		System.out.println("Circle class");
	}
}
class Square extends Shape {
	@Override
	public void draw () {
		System.out.println("Square class");
	}
}
class Rectangle extends Shape {
	@Override
	public void draw () {
		System.out.println("Rectangle class");
	}
}

public class Shape_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       circle c = new circle();
       Square s = new Square();
       Rectangle r = new Rectangle();
       c.draw();
       s.draw();
       r.draw();
       int x =2;
       System.out.println("x:"+(-~x-1));
	}

}
//   x = 2   y = 3
//  x = 010   y =011
//    010                                       001       001
//    011  ^           x = x ^ y =  001         011       010
//    001              y = x ^ y =  010         010       011
//                     x = x ^ y =  011