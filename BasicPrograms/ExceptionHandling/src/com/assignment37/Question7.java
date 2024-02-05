package com.assignment37;
//WAP to check can we have an empty catch block?
public class Question7 {
	public class EmptyCatchBlockExample {
	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0;    // throw an ArithmeticException
	        } catch (ArithmeticException e) {
	            // Empty catch block
	        }
	        
	        System.out.println("Program continues after the exception.");
	    }
	}
}
