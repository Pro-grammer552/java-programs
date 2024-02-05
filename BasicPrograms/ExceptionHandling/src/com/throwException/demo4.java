package com.throwException;

public class demo4 {

	public static void m1() {
		System.out.println(10 / 0);
	}

	public static void m2() {
		m1();
	}

	public static void m3() {
		try {
			m2();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		System.out.println("---start-----");
//	          try {
//	        	  m3();
//	          }
//	          catch(ArithmeticException e) {
//	        	  System.out.println(e.getMessage());
//	          }
		m3();
		System.out.println("---end--");
	}

}