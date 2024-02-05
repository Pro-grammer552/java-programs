package com.Assignment53Q;

public class EvenAndOddSeparation {

	public static void main(String[] args) {
		int even[] =new int[10];
		int odd[]=new int[10];
		int i;
		
		int ieven=0;
		int iodd=0;
		
		int arr[]= {10,20,30,40,51,53};
		int len=arr.length;
		
		
		for(i=0;i<len;i++)
		{
			if(arr[i]%2==0)
			{
				even[ieven]=arr[i];
				ieven++;
			}
			
			else
			{
				odd[iodd]=arr[i];
				iodd++;
			}
		}
		
		System.out.println("printing even");
		for( i=0;i<ieven;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("printing odd");
		for( i=0;i<iodd;i++)
		{
			System.out.println(odd[i]);
		}
		
		

	}

}
