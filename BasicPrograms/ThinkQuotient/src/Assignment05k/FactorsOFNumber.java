package Assignment05k;

import java.util.Scanner;

public class FactorsOFNumber {

	public static void main(String[] args) {
	
		
		//6=1,2,3,6
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				
			System.out.print(i+",");
		}
		
	}

}
