package Assignment08K;

import java.util.Scanner;

public class AverageOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		int num = sc.nextInt();
		int count=0;
		float avg=0;
		int sum = 0;
		while (num > 0) {
			int digit=num%10;
			sum=sum+digit;
			
			num=num/10;
			count++;
			
			
		}
		avg=sum/count;
		System.out.println("sum of digit :"+sum);
		System.out.println("Average of digit :" +avg);
		
		

	}

}
