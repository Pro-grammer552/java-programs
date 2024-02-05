package com.assignment25N;

public class BasicArray {

	public static void main(String[] args) {
		
		
		
		int [] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at index "+i+" :"+arr[i]);
			
		}
		
		char ch[]= {'a','b','c','d','e'};
		int len=ch.length;
		for(int i=0;i<len;i++)
		{

	
		
		}
		System.out.println("length for Array :"+len);
		System.out.println("last Index :"+ch[(len-1)]);

	}

}
