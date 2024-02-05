package com.assignment50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMain {

	static ArrayList<String> namelist = new ArrayList<String>();

	static Scanner sc = new Scanner(System.in);

	static void addObjectToList() {

		System.out.print("Enter a string : ");
		String input = sc.nextLine();
		namelist.add(input);
		System.out.println("String added to the ArrayList.");

	}

	public static String getObjectFromList() {
		System.out.println("Enter a index Number : ");
		int index = sc.nextInt();
		if (index >= 0 && index < namelist.size()) {
			//System.out.println(namelist.get(index));
			return namelist.get(index);
		} else {
			
			//System.out.println("Invalid index position.");
			return "Invalid index position.";
		}
		
		
	}

	public static void displayAllObjectFromList() {
		for (String s : namelist) {
			System.out.println(s);
		}

	}

	public static void removeObjectUsingIndex() {
		System.out.println("Enter a index Number : ");
		int index = sc.nextInt();

		if (index >= 0 && index < namelist.size()) {
			System.out.println(namelist.remove(index));
		}
	}

	public static void removeObjectUsingName() {
		System.out.println("Enter a name : ");
		String name = sc.next();
		if (namelist.contains(name)) {
			System.out.println(namelist.remove(name));

		}
	}

	public static void UpdateObjectUsingIndex() {

		System.out.println("Enter a index Number : ");
		int index = sc.nextInt();

		System.out.println("Enter a name : ");

		String name = sc.next();
		if (index >= 0 && index < namelist.size()) {
			namelist.set(index, name);
		} else {
			System.out.println("Invalid Index Position");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Menu:");
			System.out.println("1. Add object");
			System.out.println("2. Get Object based on index ");
			System.out.println("3. Display All ");
			System.out.println("4. Remove using index ");
			System.out.println("5. Remove  using name ");
			System.out.println("6. Update object");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addObjectToList();
				break;
			case 2:
				String s=getObjectFromList();
				System.out.println(s);
				break;
			case 3:
				displayAllObjectFromList();
				;
				break;
			case 4:
				removeObjectUsingIndex();
				break;
			case 5:
				removeObjectUsingName();
				break;
			case 6:
				UpdateObjectUsingIndex();
				;
				break;
			case 7:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (choice != 7);

		scanner.close();
	}

}
