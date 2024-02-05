package com.assignment37;
/*
 * WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
 */

public class Question2 {

	public static void main(String[] args) {
		int[] array = new int[5];

		try {
			int value = array[10];
			System.out.println("Value: " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds.");
		}

		System.out.println("Program continues after the exception.");
	}
}
