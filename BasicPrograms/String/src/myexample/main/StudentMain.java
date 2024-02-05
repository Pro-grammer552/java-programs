package myexample.main;

import myexample.model.Student;

import java.util.Scanner;

public class StudentMain {
	static int max = 5;
	static Student[] studArray = new Student[5];
	static int Count = 0;

	public static void addStudent() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		int studentId = sc.nextInt();
		System.out.print("Enter Student Name: ");
		String studentName = sc.next();
		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		Student s1 = new Student(studentId, studentName, age);

		checkStudentRecord(s1);

		if (checkStudentRecord(s1)) {
			System.out.println("Same record found.");
		} else if (Count >= max) {
			System.out.println("Cannot add more students.");
		} else {
			studArray[Count] = s1;
			Count++;
			System.out.println("Student added successfully.");
		}

	}

	public static boolean checkStudentRecord(Student s) {
		for (Student arr : studArray) {
			if (arr != null && arr.equals(s)) {
				return true; // Student record already exists
			}
		}
		return false; // Student record does not exist
	}

	public static void displayStudents() {
		for (int i = 0; i < Count; i++) {
			System.out.println(studArray[i]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.print("Menu:\n1. Add Student\n2. Display Students\n3. Exit\nEnter your choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addStudent();
				break;
			case 2:
				displayStudents();
				break;
			case 3:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 3);
	}
}
