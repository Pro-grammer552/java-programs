package com.prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

class Course {
	int courseid;

	public Course(int courseid) {
		super();
		this.courseid = courseid;
	}

}
public class Studentmap {
	public static void main(String[] args) {
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(new Course(101));
		courses.add(new Course(102));
		courses.add(new Course(103));

		Student s1 = new Student(1, "Suraj");
		Student s2 = new Student(2, "subhodh");

		HashMap<Student, ArrayList<Course>> map = new HashMap<Student, ArrayList<Course>>();

		map.put(s1, courses);

		for (Map.Entry<Student, ArrayList<Course>> entry : map.entrySet()) {

			System.out.println(entry.getKey().name);

		}

	}

}