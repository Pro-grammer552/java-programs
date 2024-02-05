package SundayAssignment;

import java.util.Scanner;
/*
Java program to print whether it is increasing number
 If the first number is less than the second number, and the second number is less than the third number,
 the program prints "Numbers are in Increasing Order". 
 for eg :1234  is increasing   1<2 2<3 3<4 
4598  not incresing number
 */

public class CheckIncreasingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num = sc.nextInt();

		int digit = 0;
		int store = 0;


		while (num > 0) {
			digit = num % 10;
			num = num / 10;
			store = num % 10; // 3
			
			if(digit >= store)
			{
				continue;
			}else
			{
				break;
			}

		}

		if (digit >= store) {
			System.out.println("incresing order");

		} else
			System.out.println("not an incresing");

	}

}
