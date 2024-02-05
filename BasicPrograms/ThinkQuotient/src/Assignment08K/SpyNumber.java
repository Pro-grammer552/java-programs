package Assignment08K;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		int num = sc.nextInt();
		int sum = 0;
		int mul = 1;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			mul = mul * digit;
			// System.out.println(mul);
			num = num / 10;

		}

		System.out.println(sum);
		System.out.println(mul);

		if (sum == mul)
		{
		System.out.println("NUmber is spy");
		
		}else {
			System.out.println("Number is not Spy");
		}

	}

}
