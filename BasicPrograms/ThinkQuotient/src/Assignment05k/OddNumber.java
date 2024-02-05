package Assignment05k;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println(i+" odd");
				count++;
				
			}
			//System.out.println(i);

			
		}
		System.out.println("count of odd number is : "+count);
		

	}

}
