package com.Assignment53Q;

public class BouncyNumber {

	public static void main(String[] args) {

		int num =45612;

		int ldigit = 0;
		int store = 0;

		boolean asc = false;
		boolean dec = false;
		boolean bouncy = false;
		
		ldigit = num % 10;
		
		num = num / 10;
		while (num > 0) {
			
			store = num % 10;

			//System.out.println(store);
			if (ldigit > store) {
				asc = true;
				ldigit=store;
			} if (ldigit < store) {
				dec = true;
				ldigit=store;
			}

			if (asc && dec) {
				System.out.println("bounce");
				break;
			}
              num/=10;
		}

		
	 if(asc==true && dec==false){
			System.out.println("asc");
		}
		else if(dec==true && asc==false){
			System.out.println("dec");
		}
		
	}
}
