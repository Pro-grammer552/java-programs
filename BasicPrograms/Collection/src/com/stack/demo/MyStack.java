package com.stack.demo;

import java.util.*;

public class MyStack {

	private static int[] arr = new int[10];
	private static int index = 0;

	public static void push(int data) {
		if (index < arr.length) {
			arr[index] = data;
			index++;
		} else {
			System.out.println("Stack is full" + data);
		}
	}

	public static int pop() {
		if (index > 0) {
			index--;
			int poppedElement = arr[index];
			arr[index] = 0;
			return poppedElement;
		} else {
			System.out.println("Stack empty");
			return -1;
		}
	}

	public static void display() {
		if (index == 0) {
			System.out.println("Stack empty.");
		} else {

			for (int i = index - 1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c;

		do {
			System.out.println("Enter Your Choice");
			System.out.println("-----------");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			c = sc.nextInt();

			switch (c) {
			case 1:
				System.out.println("Enter Your Number to Push:");
				int p = sc.nextInt();
				push(p);
				break;
			case 2:
				pop();

				break;
			case 3:
				display();
				break;
			case 4:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Try again.");
			}

		} while (c != 4);
	}
}