package com.prep;

public class SingleDigitSum {

	public static void main(String[] args) {
		int num = 1234;  //10

		int newnum = num;
		while (num >= 10) {
			int sum = 0;
			while (newnum > 0) {
				int dig = newnum % 10;
				sum = sum + dig;
				newnum = newnum / 10;
			}
			System.out.println(sum);
			num = sum;
			newnum = num; 
		}
		System.out.println(num);
	}

}