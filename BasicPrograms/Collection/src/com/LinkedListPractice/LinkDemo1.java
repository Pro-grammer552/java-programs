package com.LinkedListPractice;

import java.util.LinkedList;

public class LinkDemo1 {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<>();

		// Add names using various methods
		nameList.add("Alice"); // Appends at the end
		nameList.addFirst("Eve"); // Adds at the beginning
		nameList.addLast("Charlie"); // Adds at the end
		nameList.add(1, "Bob"); // Adds at a specific index

		// Update an element
		nameList.set(2, "David");

		// Remove elements
		nameList.remove("Alice");
		nameList.removeFirst();
		nameList.removeLast();
		nameList.remove(0); // Remove by index

		// Check if the list is empty
		System.out.println("Is the list empty? " + nameList.isEmpty());

		// Display the elements
		System.out.println("Name List: " + nameList);

	}
}
