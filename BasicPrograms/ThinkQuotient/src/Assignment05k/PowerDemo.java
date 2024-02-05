package Assignment05k;

import java.util.Scanner;

public class PowerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener the base");
		int base=sc.nextInt();
		System.out.println("enter the exponenet");
		int expo=sc.nextInt();
		int power=1;
		for(int i=1;i<=expo;i++)
		{
			power=power*base;
		}
		

		System.out.println(power);
	}

}
