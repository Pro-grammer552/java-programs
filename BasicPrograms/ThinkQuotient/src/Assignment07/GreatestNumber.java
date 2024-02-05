package Assignment07;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int Num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int Num2 = sc.nextInt();
		System.out.println("Enter the Third Number");
		int Num3 = sc.nextInt();

		int Num4 = Num1;

		if (Num2 > Num4) {
			Num4 = Num2;
			// System.out.println(Num4);
			if (Num3 > Num4)
				Num4 = Num3;
		}
		System.out.println("Greastest Number is " + Num4);

	}

}
