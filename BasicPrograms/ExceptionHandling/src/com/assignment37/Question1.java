package com.assignment37;

/*
 * WAP which throws ArrayIndexOutBoundsException.
 *  In the console, observe the stack trace and the 
line number from where the Exception is thrown

 */


public class Question1 {

	public static void main(String[] args) {
		int[] array = new int[5];

		try {
			int value = array[10];
			System.out.println("Value: " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
