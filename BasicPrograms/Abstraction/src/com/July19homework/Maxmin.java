/*
 5.	Create a base class to get two numbers from user in the base class. 
 The derived class contains a method ‘dispMax()’.
  Which displays maximum of two numbers and a method ‘dispMin()’ 
  to display minimum of two numbers. Use constructors.
 */


package com.July19homework;

class Base {
	int a;
	int b;
	public Base ( int a , int b) {
		this.a = a;
		this.b = b;
	}
}

class derived  extends Base{
	
	public derived ( int a , int b) {
	  super ( a,b);
	  this.Max();
	}
	public void Max () {
		if ( this.a > this.b) {
			System.out.println("a is greater");
		}else
			System.out.println("b is greater");
	}
}

public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		derived d = new derived ( 10 , 20 ); 
		
	}

}
