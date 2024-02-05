package Assignment14A;

import java.util.Scanner;

import Assignment13K.Encapsulation;

public class Paytm {

	public static void main(String[] args) {
		Customer c = new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdrawl amount : ");		
		
		int cash =sc.nextInt(); 
		
				
				//int cash=100;
		System.out.print("Total amount : ");               
		c.transfer(cash);
		
		
		

		

	}

}
