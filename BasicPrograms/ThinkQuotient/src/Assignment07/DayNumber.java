package Assignment07;

import java.util.Scanner;

public class DayNumber {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		switch(number)
		{
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("sunday");
		default :System.out.println("holiday");
		break;
		}
		

	}

}
