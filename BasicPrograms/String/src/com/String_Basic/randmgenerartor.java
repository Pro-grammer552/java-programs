package com.String_Basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class randmgenerartor {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//		StringBuilder carId = new StringBuilder();
//		Random random = new Random();
//		int length = 6;
//
//		for (int i = 0; i < length; i++) {
//			int randomIndex = random.nextInt(characters.length());
//			carId.append(characters.charAt(randomIndex));
//		}
//
//		// Collections.shuffle(characters);
//		System.out.println(carId.toString());
//		for (int i = 0; i < carId.length(); i++) {
//			System.out.println("Enter Captcha :");
//			String captcha = sc.next();
//			if (carId.equals(captcha)) {
//
//				System.out.println("good");
//			} else {
//				System.
//		out.println("Invalid");
//			}
//		}
//
//	}
//
//}

		int arr[] = { 100, 55, 200, 40, 70, 60 };
		int first = arr[0];
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < first) {
				first = arr[i];
			}
		}
		System.out.println(first+" a");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != first) {
				
				System.out.println(Arrays.toString(arr));
				
				if (arr[i] < second) {
					second = arr[i];
					
				}

			}

		}
		System.out.println(second);
		
		
	}
}
