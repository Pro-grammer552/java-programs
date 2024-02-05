package Assignment05k;

import java.util.Scanner;

public class PrimeNumberBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean isPrime = true;

		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
			
				
			}
		}
			if (isPrime == true) {
				System.out.println("Prime");

			} else {
				System.out.println("not prime ");
		

			}
		

	}

}



	