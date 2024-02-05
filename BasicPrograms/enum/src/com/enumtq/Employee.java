package com.enumtq;

import java.util.ArrayList;
import java.util.Iterator;



public class Employee {
	private String name;
	private int empId;
	private EmployeeType empType;

	public Employee(String name, int empId, EmployeeType empType) {
		this.name = name;
		this.empId = empId;
		this.empType = empType;
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Type: " + empType);
	}

	public static void main(String[] args) {
	

		
		Employee emp1 = new Employee("John", 101, EmployeeType.PERMANENT);
		Employee emp2 = new Employee("Sarah", 102, EmployeeType.NON_PERMANENT);
		
		
		
		

		emp1.displayEmployeeInfo();
		System.out.println();
		emp2.displayEmployeeInfo();
	}
}

enum EmployeeType {
	PERMANENT, NON_PERMANENT
}
