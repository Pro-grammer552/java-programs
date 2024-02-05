package com.Stringassignmet40;

public class CountLastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vedant is good boy vedant is handsome boy vedant";
		s=s.trim();
		int last=s.length()-1;
		
		//System.out.println(last);
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			count++;
			if(s.charAt(i)==' ')
			{
				count--;
				break;
			}
			
		}
		System.out.println(count);
		
	}

}
