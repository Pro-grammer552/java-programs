package SundayAssignment16K;

import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Pnumber");
		long mobileNo = sc.nextInt();
		System.out.println("Enter the DigitCount");
		int count = sc.nextInt();
		
	
		int counter=0;
	
		while(mobileNo>0)
		{
			int digit=(int)mobileNo%10;
			
			if(digit==count)
			{
				counter++;
			}
			mobileNo=mobileNo/10;
		}
		
		
		System.out.println("The Number "+count+" frequency is "+counter+" Times");
		
		
		

	}

}
