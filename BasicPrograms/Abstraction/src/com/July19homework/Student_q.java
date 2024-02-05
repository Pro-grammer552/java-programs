/*
 1.	Declare a class ‘Student’ with data members ‘name’, ‘roll number’ and ‘marks’.
  Also declare a class ‘MyRecord’ which inherited from class ‘Student’.
  Display name, roll number and percentage by creating the object of class MyRecord.
 */


package com.July19homework;

class Student {
	String name;
	int roll_number;
	int marks;
	public Student ( String name , int roll_number , int marks) {
		this.name = name;
		this.roll_number = roll_number;
		this.marks = marks;
	}
}
class Record extends Student {
	public Record ( String name , int roll_number , int marks) {
		super ( name , roll_number , marks);
		this.display();
	}
	public void display ( ) {
		System.err.println("Name :"+ name + "Roll NUmber :"+ roll_number +"Marks:"+marks);
	}
}

public class Student_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Record r = new Record("Subodh",101,90);
	}

}
