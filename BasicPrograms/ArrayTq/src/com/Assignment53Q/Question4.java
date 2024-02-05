package com.Assignment53Q;
/*
 4.	WAP to take array and print all positive numbers 
 */

import java.util.Scanner;

public class Question4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	    	int count=0;
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        // Input elements into the array
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element at index " + i + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        // Print positive numbers in the array
	        System.out.println("Positive numbers in the array are:");
	        for (int i = 0; i < size; i++) {
	            if (arr[i] > 0) {
	            	count++;
	                System.out.println(arr[i] + " ");
	              
	            }
	            
	        }
	        System.out.println("Count for positive number :"+count);

	        scanner.close();
	    }
	}

