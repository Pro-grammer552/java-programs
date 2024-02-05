package Assignment07;

import java.util.Scanner;

public class EvenOddTernary {

	public static void main(String[] args) {

//(ans=(condition)?true:false;)

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();

		String result = num % 2 == 0 ? "Even Number" : "Odd NUmber";
		
		String  ans= num%5==0 ? "Divisible By 5 ":"Not Divisible by 5";
		
		
		
		String res= num>0?"positive":num==0 ?"Zero":"Negative";
		
	
		
		
		
		
		System.out.println(num + " is " +result);
		System.out.println(num +" is " + ans);
		
		System.out.println(num +" is " + res);
	}

}
