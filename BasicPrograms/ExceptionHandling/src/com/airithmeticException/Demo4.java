package com.airithmeticException;

//with the help of try we can achieve only one exception at a time 
// another exception will not work .

public class Demo4 {

	public static void main(String[] args) {

		String s = null;

		int num[] = { 1, 2, 30 };
		int a = 10;
		int b = 0;
		try {
			int div = 10 / 5;
			System.out.println(num[7]);
			System.out.println(s.length());

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array bound");
			System.out.println(e.getMessage());
			
		}catch (RuntimeException e) {
			
			System.out.println("Error");
			System.out.println(e.getMessage());
		}catch (Exception e) {   //exception is parent class of all class so we cant write runtime after exception
			System.out.println(e.getMessage());
		}
		System.out.println("RIP");
	}

}
