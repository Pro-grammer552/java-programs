package com.Assignment53Q;

//wap to revese order arrAY

public class PrintReverse {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		int len=arr.length;
		for(int i=len-1;i>=0;i--)
		{
			
			
			System.out.println("Reverse order: "+arr[i]);
			//System.out.println("Original array: " + arr.toString());
		}

	}

}
