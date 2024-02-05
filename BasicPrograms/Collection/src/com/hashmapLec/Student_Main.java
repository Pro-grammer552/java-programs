package com.hashmapLec;
import java.util.HashMap;
import java.util.Map;

class Student{

	private int id;
	private String name;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nStudent Id\t: " + id +"\nStudent Name\t: " + name + "\nStudent Marks\t: "+ marks ;
	}
	

}

public class Student_Main {

	public static void main(String[] args) {

		HashMap<Student, String> std = new HashMap<Student, String>();
		int	count=0;
		std.put(new Student(111, "Harsh", 68), "html");
		std.put(new Student(222, "Yash", 56), "css");
		std.put(new Student(333, "Ishank", 89), "html");
		std.put(new Student(444, "Nikhil", 88), "html");
		std.put(new Student(555, "Dhanu", 78), "js");
		std.put(new Student(666, "Nishant", 77), "js");

		System.out.println("---Students List---");

		for (Map.Entry<Student, String> m : std.entrySet()) {
			//System.out.println(m.getKey() + " " + m.getValue());
			System.out.println(m.getValue()+1 );
			
			HashMap<String, Integer> std1 = new HashMap<String, Integer>();
			
			if(m.getValue().equals(m.getValue()))
			{
				count++;
			}
			std1.put(m.getValue()+1, count);
			
		}
		
		}

}