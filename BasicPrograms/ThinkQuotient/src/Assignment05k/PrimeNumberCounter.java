package Assignment05k;

import java.util.Scanner;

public class PrimeNumberCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int counter = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
			counter++;
			}
		}
		
		if(counter==0)
		{
			System.out.println("Prime");
		}else
		{
			System.out.println("Not prime");
		}

	}

}
