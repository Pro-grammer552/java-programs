package com.prep;

import java.util.ArrayList;

//Employee Array name involves at least 2 vowels

public class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {

		String vowel = "AEIOUaeiou";

		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new Employee(1, "Alice", 50000));
		arr.add(new Employee(2, "Boc", 80000));
		arr.add(new Employee(3, "Bobae", 90000));
		arr.add(new Employee(4, "Bobb", 10000));

		for (int i = 0; i < arr.size(); i++) {
			int count = 0;
			for (char c : arr.get(i).name.toCharArray()) {
				if (vowel.contains(String.valueOf(c))) {
					count++;
				}
			}
			if (count >= 2) {
				System.out.println(arr.get(i).name);
			}
		}
	}

}