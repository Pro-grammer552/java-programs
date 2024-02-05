package com.assignment3107;

import java.util.Arrays;

class Student {

	private int rollNo;
	private String name;
	private int marks;

	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "ArrayOfObject [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}

class StudentTest {
	public static void ShowNames(Student sarr[]) {
		int i;
		int len =sarr.length;

		for (i = 0; i < len; i++) {
			if (sarr[i].getMarks() >= 70) {
				
			}
			System.out.println(sarr[i]);
		}
	}
}

public class ArrayOfObject {

	public static void main(String[] args) {

		Student sarr[] = new Student[5];

		System.out.println(sarr[0]);
		System.out.println(sarr[1]);

		sarr[0] = new Student(12, "abc", 55);
		sarr[1] = new Student(12, "abc", 55);
		sarr[2] = new Student(13, "seff", 65);
		sarr[3] = new Student(14, "xyz", 79);
		sarr[4] = new Student(15, "klk", 80);

		System.out.println(sarr[0]);
		System.out.println(sarr[1]);
		System.out.println(sarr[2]);
		System.out.println(sarr[3]);
		System.out.println(sarr[4]);

		System.out.println("-----------------------");

		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}

		System.out.println("-------------------------------");

		for (Student s : sarr) {
			System.out.println(s);
			
		System.out.println("-----------70++---------------------------");	
			StudentTest s1=new StudentTest();
					s1.ShowNames(sarr);
			
		}

	}

}
