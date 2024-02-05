package com.Assignment53Q;

/*
Write a java method called checkReverseSum which returns true if the sum of first three numbers is equal to sum of last three numbers. Input is anumber of min 3 digits to the method, output is a boolean.[1.5M]								
Input value"678597"		returns true(6+7+8 and 5+9+7)
Input value "32105"		returns true(3+2+1 and 5+0+1)
Input value "123"		returns true(1+2+3 and 3+2+1)
Input value "1b8" 		returns false
*/
public class CheckReverseSum {

	public static int sumOfFirstThreeDigits(int num) {
		int sum = 0;
		int count = 0;
		while (num != 0 && count < 3) {
			sum += num % 10;
			num /= 10;
			count++;
		}
		return sum;
	}

	public static int sumOfLastThreeDigits(int num) {
		int reversed = 0;
		int sum1 = 0;
		int count = 0;

		while (num != 0 && count < 3) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			sum1 += digit;
			num /= 10;
			count++;
		}

		System.out.println(reversed + " kj");
		System.out.println(sum1);

		return reversed;
	}

	public static void main(String[] args) {

		int sf = 678597;

		System.out.println(sumOfFirstThreeDigits(sf));
		System.out.println(sumOfLastThreeDigits(sf));
	}

}