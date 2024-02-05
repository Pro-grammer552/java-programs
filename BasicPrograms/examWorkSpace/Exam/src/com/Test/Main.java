package com.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[1];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details ");
            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Course: ");
            String course = sc.next();

            int[] marks = new int[3];
            System.out.println("Enter marks for Student ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Mark " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            students[i] = new Student(id, name, course, marks);
        }

        for (Student student : students) {
            System.out.println(student);
            int totalMarks = student.getTotalMarks();
            System.out.println("Total Marks: " + totalMarks);
            
            if (totalMarks > 50) {
                System.out.println("Exception: Total marks exceeded 50");
            }
        }
    }
}