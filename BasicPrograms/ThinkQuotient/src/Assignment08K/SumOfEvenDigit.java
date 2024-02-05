package Assignment08K;

import java.util.Scanner;
//write code to find out the sum of even digit from the number 

public class SumOfEvenDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		int num = sc.nextInt();
		int sum = 0;
		//int i=1;
		while (num!=0) {
			int digit=num%10;
			if(digit%2==0) {
				sum=sum+digit;
			}
			num=num/10;
				
			System.out.println("sum of even number is "+sum);
	}
	

}
}