package com.Assignment53Q;

/*
 7.	Write two methods that return the average of an array with following headers.
a.	public static int average(int[] array)
b.	public static double average(double[] array).
c.	Write main and invoke the 2 methods. 

 */

public class Question7 {

	public static int average(int[] array) {
		int sum = 0;
		int avg = 1;
		int len = array.length;
		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

			avg = sum / len;
			System.out.println("sum" + sum);

		}
		System.out.println("avg " + avg);

		return 0;
	}

	public static void average(double[] array1) {
		double sum = 0;
		double avg = 1;
		int len = array1.length;
		for (int i = 0; i < len; i++) {

			sum = sum + array1[i];

			avg = sum / len;

		}
		System.out.print("sum" + sum);
		System.out.println("");
		System.out.print("avg " + avg);

	}

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 50, 60 };
		double array1[] = { 10, 20, 30, 50, 60 };

		average(array);

		average(array1);

	}

}
