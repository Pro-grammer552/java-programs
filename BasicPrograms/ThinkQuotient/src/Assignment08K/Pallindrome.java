package Assignment08K;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name ");
		int num = sc.nextInt();
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int digit=num%10;
			 rev= rev*10+digit;
			 num/=10;
		}
		System.out.println(rev+ " " + num);
		if(temp==rev)
		{
			System.out.println("Number is palindrome");
		}else
		{
			System.out.println("Number is not palindrome");
		}
	}

}
