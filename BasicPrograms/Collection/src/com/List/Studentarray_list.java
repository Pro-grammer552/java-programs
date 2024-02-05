package com.List;

import java.util.ArrayList;

class Student {
	private String name;
	private int id;
	private int marks;

	public Student(String name, int id, int marks) {

		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]\n";
	}

	public void show() {
		System.out.println(name + " " + id + " " + marks);
	}

}

public class Studentarray_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student("Subodh", 101, 84));
		st.add(new Student("S", 102, 90));
		st.add(new Student("Kavita", 103, 70));

		System.out.println(st);

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}

		System.out.println("Show Method");
		for (int i = 0; i < st.size(); i++) {
			st.get(i).show();

		}



		// ----------kavita present or not--------

		boolean isavailable = false;
		for (int i = 0; i < st.size(); i++) {

			if (st.get(i).getName() == "Kavita") {
				isavailable = true;
			} else
				isavailable = false;
		}

		// or
		System.out.println("----Another MEthod-------");

		boolean iskavi = false;
		for (int j = 0; j < st.size(); j++) {

			iskavi = st.get(j).getName().equals("Kavita");
		}
		System.out.println(iskavi);
		
		
		for (int i = 0; i < st.size(); i++) {

			if (st.get(i).getId() > 101) {
				System.out.println(st.get(i));
			}
		}
		
	}

}
