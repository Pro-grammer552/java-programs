package SundayAssignment;

import java.util.Scanner;

/*Q1)Java program to determine whether number is harshad or not

A number is said to be the Harshad number if it is divisible by
 the sum of its digit. For example, if number is 156, then
  sum of its digit will be 1 + 5 + 6 = 12. Since 156 is divisible by 12.
   So, 156 is a Harshad number.
*/

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}

		if(num%sum==0)
		{
			System.out.println("Its Harshad Number");
		}else
		{
			System.out.println("Not an Harshad Number");
		}
	}

}
