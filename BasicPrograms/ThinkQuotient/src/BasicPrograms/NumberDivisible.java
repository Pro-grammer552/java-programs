package BasicPrograms;

import java.util.Scanner;

public class NumberDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if(a%5==0 && a%11==0) {
			System.out.println("Number divisible by 5 & 11");
		}else {
			System.out.println("Number is not divisibe by 5 & 11");
		}

	}

}
