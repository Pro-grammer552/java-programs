package Assignment05k;

import java.util.Scanner;

public class PriceOfBarrel {
	/*
	 * 
	 * You have 20 barrels of fuel. The price per barrel is 89rs. For the first 10
	 * barrels. If someone wants more than 10 barrels, the price reduces by the
	 * number of barrels bought. For e.g. the price of 6 barrels is 6 * 89 But price
	 * of 12 barrels is 12 * (89 - 12) or price of 18 barrels is 18 * (89 - 18) and
	 * so on. Display all the prices from 1 to 20 barrels.  
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int barrel = 89;
		int price = 0;
		for (int i = 1; i <= 20; i++) {
			if (n <= 10) {
				price = barrel * i;

			} else {
				price = i * (barrel - i);

			}
			
			System.out.println("price of " + i + " barrel is " + price);

		}

	}
	

}