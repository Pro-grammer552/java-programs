package com.LinkedListLab;

import java.util.LinkedList;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	int salary;

	Employee() {

	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class question_3_Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<Employee> l1 = new LinkedList<Employee>();
		Employee e = new Employee();

		l1.add(new Employee(101, "Suraj", 552));

		for (int i = 1; i < 3; i++) {
			System.out.println("Enter id:");
			int num = sc.nextInt();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter salary:");
			int sal = sc.nextInt();

			boolean isDuplicate = false;
			for (int j = 0; j < l1.size(); j++) {
				Employee emp = l1.get(j);
				if (emp.getId() == num || emp.getName().equals(name)) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				l1.add(new Employee(num, name, sal));
			} else {
				System.out.println("Entry is already exist.");
			}
		}
		System.out.println(l1);
	}
}
