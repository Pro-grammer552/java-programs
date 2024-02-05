package com.hotQuestion;

/*
 Create a Class as Student in Student class 
 we have roll no Student Name, Course 1 or more Course can Enroll

Task 2 Create Main method in seprate
 class create aylist that hold Student Object

Step 2 we have to find Out How course 
student Has Enrolled count that enrolled Course and
store that number of Courses student has enrolled store
in Hashmap Value Should be Course Count and Key should be Student Object "/ 20

 */

import java.util.*;

class Student {
	private int rollno;
	private String name;
	private String course[];

	public Student(int rollno, String name, String[] course) {

		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + Arrays.toString(course) + "]";
	}

}
