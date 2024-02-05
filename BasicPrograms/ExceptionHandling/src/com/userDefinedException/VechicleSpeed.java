package com.userDefinedException;

import java.util.Scanner;

class VechicleNotFoundException extends RuntimeException {

	public VechicleNotFoundException(String msg) {
		super(msg);
	}
}

public class VechicleSpeed {

	public static void checkVechicleSpeed(int Speed) {

		if (Speed > 80) {
			throw new VechicleNotFoundException("Please check Your Speed....Danger Ahead..!");
		} else {
			System.out.println("lets continue Riding...!!");
		}

	}

	public static void main(String[] args) {
		System.out.println("---------Start Riding--------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Speed : ");
		int Speed = sc.nextInt();
		try {
			checkVechicleSpeed(Speed);

		} catch (VechicleNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------Keep Riding-------");
	}

}
0