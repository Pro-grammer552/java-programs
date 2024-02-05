package com.July18homework;

class Parent {
	int p;
	String name;
	
	public Parent (int p , String name) {
		//System.out.println("Inside Parent class");
	    this();
		this.p = p;
		this.name = name;
		System.out.println("Inside the parent class");
		this.d();
	}
	
	public Parent () {
		System.out.println("Parent default constructor");
	}
	public void d () {
		
		System.out.println("Property :"+ p + " "+ "Name:"+name);
	}
}
class Child extends Parent {
	
	public Child (int p , String name , int age) {
       
		super(p,name);
		//super.d();
		System.out.println("Age:"+age);
		System.out.println("Inside child class");
		
	}
}

public class This_super_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		Child c = new Child(200000, "Subodh",22);

	}

}
