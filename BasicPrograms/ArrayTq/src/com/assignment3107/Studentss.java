package com.assignment3107;

import java.util.Scanner;

public class Studentss {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Students[] ss=new Students[3];
	      Scanner in=new Scanner(System.in);
	      for(int i=0;i<ss.length;i++) {
	    	  
	    	  
	    	  ss[i]=new Students();
	    	  System.out.println("Enter the rollno:");
	    	  ss[i].setrollno(in.nextInt());
	    	  System.out.println("Enter the name:");
	    	  ss[i].setname(in.next());
	    	  System.out.println("Enter the marks:");
	    	  ss[i].setmarks(in.nextDouble());
	    	  
	      }
	      
	      for(Students student:ss) {
	    	  System.out.println(student);
	      }
	      
		}

	}
