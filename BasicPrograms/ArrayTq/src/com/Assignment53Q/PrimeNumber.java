package com.Assignment53Q;

/*
 6.	WAP to take array and print prime numbers
 */

public class PrimeNumber {
	
	
	public static void FindPrimeNumber(int n[])
	{

		for (int j = 1; j < n.length; j++) {
			int flag = 0;

			for (int i = 2; i <= n[j] /	 2; i++) {

				if (n[j] % i == 0) {
					flag++;
					break;

				}
			}

			if (flag == 0) {
				System.out.println(n[j] + " is prime");
			} else {
				System.out.println(n[j] + " non prime");
			}
		}
		
		
	}

	public static void main(String[] args) {

		int n[] = { 2, 3, 4, 5, 6, 7 };

		FindPrimeNumber(n);


	}

}
