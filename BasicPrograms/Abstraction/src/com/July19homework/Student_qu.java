package com.July19homework;

class Student1 {
	String name;
	int roll_number;
	public Student1(String name, int roll_number) {
		
		this.name = name;
		this.roll_number = roll_number;
	}
	
}
class Record1  extends Student1{
	String address;

	public Record1(String name, int roll_number, String address) {
		super(name, roll_number);
		this.address = address;
		this.display();
	} 
	public void display () {
		System.out.println("Name:"+name + "Roll number :"+ roll_number+"Address"+address);
	}
}

public class Student_qu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Record1 r = new Record1 ( "Sk" , 101 , "Narhe");

	}

}
