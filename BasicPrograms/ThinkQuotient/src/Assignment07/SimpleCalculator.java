package Assignment07;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a = sc.nextInt();
		System.out.println("Enter the second number ");
		int b = sc.nextInt();
		System.out.println("Enter the operation ");
		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println("Addition of " + a + " and " + b + " is" + (a + b));
			break;
		case '-':
			System.out.println("Substraction of " + a + " and " + b + " is " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
			break;
		case '/':
			System.out.println("Division of " + a + " and " + b + " is  " + (a / b));
			break;
		default:
			System.out.println("Invalid operation");
			break;

		}
	}

}
