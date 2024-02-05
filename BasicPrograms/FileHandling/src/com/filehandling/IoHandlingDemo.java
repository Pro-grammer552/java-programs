package com.filehandling;
import java.util.Scanner;

public class IoHandlingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		System.out.println("Age :"+age);
		System.err.println("Age :"+age);

	}

}
