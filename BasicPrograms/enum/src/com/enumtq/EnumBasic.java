package com.enumtq;

import java.util.Scanner;

public class EnumBasic {

	enum month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choice;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of monthsry");
		
		choice = sc.next();
		month m = month.valueOf(choice.toUpperCase());
		switch (m) {

		case JANUARY:
			System.out.println("Selected month is JANUARY");
			break;
		case FEBRUARY:
			System.out.println("Selected month is FEBRUARY");
			break;
		case MARCH:
			System.out.println("Selected month is MARCH");
			break;
		case APRIL:
			System.out.println("Selected month is April");
			break;
		default:
			System.out.println("MAy-DEC");
			break;
		}

	}

}
