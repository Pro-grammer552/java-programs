package com.assignment37;

/*
 * WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
 */

public class Question3 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };

		try {
			int value = array[10];
			System.out.println("Value: " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Program continues after the exception.");
	}
}
