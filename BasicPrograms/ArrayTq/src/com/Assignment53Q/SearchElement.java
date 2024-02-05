package com.Assignment53Q;

import java.util.Scanner;

public class SearchElement {

	public static void Search(int[] arr,int search) {
		int i;

		for (i = 0; i < arr.length; i++) {

			if (search==arr[i]) {
				System.out.println(search + " is present at " + i + " index");
				
			}else
			{
				System.out.println(search +" Element is not present in array " + i + " index");
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr searching number");
		int search = sc.nextInt();

		int arr[] = { 10, 20, 30,30, 40 };
		
		Search(arr,search);
	}

}
