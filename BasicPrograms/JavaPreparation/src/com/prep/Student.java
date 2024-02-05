package com.prep;

import java.util.*;

public class Student {

	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {

		Student s1 = new Student("subhodh", 101);
		Student s2 = new Student("keshav", 102);
		Student s3 = new Student("suraj", 103);
		Student s4 = new Student("abc", 101);
		ArrayList<Integer> marks1 = new ArrayList<Integer>();
		marks1.add(70);
		marks1.add(30);
		marks1.add(30);
		marks1.add(10);
		ArrayList<Integer> marks2 = new ArrayList<Integer>();
		marks2.add(10);
		marks2.add(20);
		marks2.add(10);
		marks2.add(50);

		HashMap<Student, ArrayList<Integer>> studmarks = new HashMap<>();

		studmarks.put(s1, marks1);
		studmarks.put(s2, marks2);
		studmarks.put(s3, marks1);
		studmarks.put(s4, marks2);

		Set<Student> pstudent = new HashSet<>();
		Set<Student> fstudent = new HashSet<>();

		for (Map.Entry<Student, ArrayList<Integer>> entry : studmarks
				.entrySet()) {

			int total = 0;
			for (Integer ma : entry.getValue()) {
				total = total + ma;
			}

			System.out.println("Total Marks : "+total);
			if (total > 100) {
				pstudent.add(entry.getKey());
				System.out
						.println("Passed Student: " + entry.getKey().getName());
			} else {
				fstudent.add(entry.getKey());
				System.out
						.println("Failed Student: " + entry.getKey().getName());
			}
		}
	}
}