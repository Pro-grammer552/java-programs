package com.Assignment53Q;

import java.util.Arrays;

class Student {
	int rollNo;
	String name;
	int marks[];

	public Student(int rollNo, String name, int marks[]) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.sum();
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ",\n name=" + name + "," + "\n marks=" + Arrays.toString(marks) + "]";

	}

	public void sum() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println("sum "+sum);
	}

}

public class TestInstanceDemo {

	public static void main(String[] args) {

		int[] marks = new int[] { 10, 20, 30, 40, 50 };
		int[] marks1 = new int[] { 10, 20, 30, 40, 50 };
		int[] marks2 = new int[] { 10, 20, 30, 40, 50 };

		Student s1 = new Student(101, "Suraj", marks);
		
		Student s2 = new Student(102, "bk", marks1);
		Student s3 = new Student(103, "Sk", marks2);
		//System.out.println(s1);
		//s1.sum();

	}
}
