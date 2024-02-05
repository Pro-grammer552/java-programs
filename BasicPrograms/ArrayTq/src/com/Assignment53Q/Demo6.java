package com.Assignment53Q;

/*
 6. Write Java Program to store 5 Student type objects in continuous memory blocks. 
Each Student will have roll, name, marks. [5] 
1.Sort these objects in ascending order of marks, write a method sortRecords in 
Student with Student type array as parameter. 
2.Write showRecords Method in Student class to show all records by using for each 
loop.
 */


import java.util.Arrays;

class Student {
    int roll;
    String name;
    int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Student(int roll2, String name2, int marks2) {
		// TODO Auto-generated constructor stub
	}

	public void showRecord() {
        System.out.println("Roll no: " + roll);
        System.out.println("Name: " + name);
        System.out.println("marks: " + (marks));
    }

    public static void sortRecords(Student s[]) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1; j++) {
                if (s[j].marks > s[j + 1].marks) {
                    Student temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
    }
}

public class Demo6 {

    public static void main(String[] args) {
        Student[] s = new Student[5];

        s[0] = new Student(101, "Ram", 99);
        s[1] = new Student(102, "Bhagyesh", 100);
        s[2] = new Student(103, "Raju", 88);
        s[3] = new Student(104, "Divya", 70);
        s[4] = new Student(105, "Chaitu", 90);

        for (Student st : s) {
            System.out.println(st);
        }

        System.out.println("---------After sorting marks (Ascending)--------");

        Student.sortRecords(s);

        for (Student st : s) {
            System.out.println(st);
        }
    }
}
