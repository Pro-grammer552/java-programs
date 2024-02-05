package com.assignment3107;

import java.util.Scanner;

public class StudentUsingArrayObject {
	   static Scanner in=new Scanner(System.in);
		public static void adddetails(Students s) {
			System.out.println("Enter the rollno");
			s.setrollno(in.nextInt());
			System.out.println("Enter the name");
			s.setname(in.next());
			System.out.println("Enter the marks");
			s.setmarks(in.nextDouble());
			
		}
		
		public static  void  show(Students arr[]) {
			for(Students s:arr) {
				System.out.println(s);
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         Students[] ss1=new Students[4];
	         
	         for(int i=0;i<ss1.length;i++) {
	        	 ss1[i]=new Students();
	        	 adddetails(ss1[i]);
	         }
	         
	         show(ss1);
		}

	}