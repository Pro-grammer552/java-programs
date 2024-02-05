package com.Assignment53Q;


/*
 1.	WAP to add elements to single dimensional
  int array and print elements from 1D array
 */

import java.util.Scanner;

public class Question1 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element at index " + i + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        System.out.println("Elements in the array are:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        scanner.close();
	    }
	}





