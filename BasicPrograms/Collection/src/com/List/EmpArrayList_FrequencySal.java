package com.List;

//Find No of employees having same sal i.e frequency of sal

import java.util.ArrayList;

class Employee1 {
	private int id;
	private String name;
	private double salary;

	public Employee1() {

	}

	public Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {

		return "Emp_id:" + id + "," + "Emp_name:" + name + "," + "Emp_salary:" + salary;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setId(int id) {
		id = this.id;
	}

	public void setName(String name) {
		name = this.name;
	}

	public void setSalary(double salary) {
		// salary = this.salary;
		this.salary = salary;
	}

}

public class EmpArrayList_FrequencySal extends Employee1 {

	public static void main(String[] args) {
		ArrayList<Employee1> emparr = new ArrayList<Employee1>();

		emparr.add(new Employee1(1, "harry_potter", 10));
		emparr.add(new Employee1(2, "merry", 20));
		emparr.add(new Employee1(3, "sachin", 10));
		emparr.add(new Employee1(4, "piter", 10));
		emparr.add(new Employee1(5, "ram", 20));
		emparr.add(new Employee1(6, "raj", 30));
		int size = emparr.size();

		System.out.println("----length greater than 7-----");
		
		for (int k = 0; k < emparr.size(); k++) {
			
			
			
			if (emparr.get(k).getName().length() > 7) {
				emparr.remove(k);
			}

		}
		System.out.println(emparr);
		
		System.out.println();

		System.out.println("Frequency of emp whose having same salary........ ");

		int count;

		for (int i = 0; i < emparr.size(); i++) {
			count = 1;

			if (emparr.get(i).getSalary() == -1) {
				continue;
			}

			for (int j = i + 1; j < emparr.size(); j++) {
				if (emparr.get(i).getSalary() == emparr.get(j).getSalary()) {
					count++;
					emparr.get(j).setSalary(-1);
				}
			}

			if (emparr.get(i).getSalary() != -1) {
				System.out.println("Employees with a salary of " + emparr.get(i).getSalary() + " count: " + count);
			}
		}
	}
}
