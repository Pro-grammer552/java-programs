package com.comapresorting;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student other) {
		if (this.id == other.id) {
			return 0;
		} else if (this.id < other.id) {
			return -1;
		} else {
			return 1;
		}
	}

	// sorting with name

//	@Override
//	public int compareTo(Student other) {
//	    if (this.name.equals(other.name)) {
//	        return 0;
//	    } else if (this.name.compareTo(other.name) < 0) {
//	        return -1;
//	    } else {
//	        return 1;
//	    }
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}

public class SortingWithCompare {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(103, "Suraj", 70));
		students.add(new Student(101, "subhodh", 80));
		students.add(new Student(105, "keshav", 60));
		students.add(new Student(102, "Kavita", 90));
		students.add(new Student(104, "Kavita", 75));

		Collections.sort(students);
		System.out.println("Before sorting:");
		for (Student student : students) {
			System.out.println(student);
		}

		Collections.sort(students);

		System.out.println("\nAfter sorting:");
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
