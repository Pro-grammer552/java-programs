package Assignment10K;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the pattern:");
		int n = sc.nextInt();
		//int n=5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				// System.out.println(i);
				if (i == n || j == n|| i==1)
                	
					System.out.print("*");
				
	            
				System.out.print("");
			}
			System.out.println();
		}
	}
}
