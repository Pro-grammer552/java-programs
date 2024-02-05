package SundayAssignment;

import java.util.Scanner;

/*
 * Java program to find sum of even numbers in single digit.  for eg  456789  o/p 18

 */
public class SumOFEven {
   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Number:");
	        int n = sc.nextInt();
	        int sum = 0;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit % 2 == 0) {
	                sum += digit;
	            }

	            n /= 10;
	        }

	        System.out.println("Sum of even digits: " + sum);
	    }
	}



