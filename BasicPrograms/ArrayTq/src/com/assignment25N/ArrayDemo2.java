package com.assignment25N;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int n, i;

		double marks[] = new double[10];
		int len = marks.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("How  many marks you want to add ");

		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Enter marks");
			marks[i] = sc.nextDouble();

		}

		System.out.println("------Array-----");

		for (i = 0; i < n; i++) {
			System.out.println("Marks[" + i + "]:" + marks[i]);
		}

	}

}
