package com.July18homework;

import java.util.Scanner;

class Bank{
	
	public void Interest() 
	{
		System.out.println("\nYour acc has rate of interets is 2%. ");
	}
	public void Saving()
	{
		System.out.println("\nA saving acc has rate of interets is 3%. ");
	}
	public void Current()
	{
		System.out.println("\nA current acc has rate of interets is 5%. ");
	}
public class Interest {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		Bank bk = new Bank();
		
		System.out.println("1.Saving\n2.Current\n3.Null");
		
		System.out.println("\nEnter Acc Type :");
		String ac= sc.next();
		
		if(ac.equals("Current") )
		{
			bk.Current();
		}
		else if(ac.equals("Saving"))
		{
			bk.Saving();
		}
		else if(ac.equals("Interest")) 
		{
			bk.Interest();
		}else
		{
			System.out.println("Error");
		}
		

	}

}}
