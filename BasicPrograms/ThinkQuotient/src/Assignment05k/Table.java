package Assignment05k;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the  name ");
		int n=sc.nextInt();
		
		int max=0;
		for(int i=1;i<=10;i++)
		{
			max=n*i;
			System.out.println(n+"*"+ i +"=" +max);
					
		}
	//	System.out.println(max);
		
	}

}
