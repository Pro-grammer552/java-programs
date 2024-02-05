/*
Define a class ‘Human’ having data members name and gender. Create classes ‘Woman’ and ‘Man’ derived from ‘Human’ 
 *having data member age in both. Create objects of ‘Man’ and ‘Woman’ having a constructor to initialize
 * all data members (including super class) for both classes.
 * Define method find() in ‘Human’ to pass objects of ‘Man’ and ‘Woman’. It will find who is elder.
 */


package com.July19homework;

class Human {
	String name;
	String gender;
	
	public Human ( String name , String gender) {
		this.gender = gender;
		this.name = name;
	}
	public void display ( int menage , int womanage ) {
		if ( menage > womanage) {
			System.out.println("Age of man is greater");
		}
		else
			System.out.println("Age of woman is greater");
	}
}

class Man extends Human {
	int age ;
	public Man(  String name , String gender , int age ) {
		super( name , gender);
		this.age = age;
	
	}
	
}

class Woman extends Human {
	int age;
	public Woman(  String name , String gender , int age ) {
		super( name , gender);
		this.age = age;
		
	}
}


public class Human_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Man m = new Man("Sk","Male",20);
		Woman w = new Woman ( " DK", "Female",19); 
		
		w.display(m.age , w.age);

	}

}
