package Assignment07A;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Pnumber");
		int Pnumber = sc.nextInt();
		System.out.println("Enter the DigitCount");
		int DigitCount = sc.nextInt();
		
		//int Pnumber = 8765546;
		//int DigitCount = 5;
		int count = 0;

		while (Pnumber > 0) {
			int lastDigit = Pnumber % 10;
			if (lastDigit == DigitCount) {
				count++;
			}
			Pnumber = Pnumber / 10;
		}

		
		
		System.out.println("The digit " + DigitCount + " appears " + count + " times.");

	}

}
