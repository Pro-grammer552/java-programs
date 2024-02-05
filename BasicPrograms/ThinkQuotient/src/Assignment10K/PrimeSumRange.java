package Assignment10K;

import java.util.Scanner;

public class PrimeSumRange {

	public static void main(String[] args) {
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num = sc.nextInt();

		System.out.println("Enter the second Number");
		int last = sc.nextInt();

		System.out.println("----------------------------");

		for (num = num; num <= last; num++) {
			boolean isprime = true;
			if (num < 2) {
				isprime = false;
			}

			for (int i = 2; i < num; i++) {
				
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}

			if (isprime == true) {
				sum = sum + num;
				System.out.println(num);

			}
		}
		System.out.println("sum : " + sum);

	}

}
