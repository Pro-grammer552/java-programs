package com.test;

import com.operation.EmployeeOperation;
import com.pojo.Employee;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		char ch;

		Employee empObj = null;
		EmployeeOperation emp = new EmployeeOperation();

		do {
			System.out.println(
					"1. Add Employee \n2. Update Employee\n3. Delete Employee \n4. Show Employee\n5. Search Employee By Id");

			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("----Add Employee Operation---");
				System.out.println("--How Many Employees You Want to Add to the Array---");
				num = sc.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("Enter the ID : ");
					int eid = sc.nextInt();
					System.out.println("Enter the Name : ");
					String ename = sc.next();
					System.out.println("Enter the Esal  : ");
					int esal = sc.nextInt();
					empObj = new Employee(eid, ename, esal);
					emp.addemployee(empObj, num);
				}
				break;

			case 2:
				System.out.println("----Update Employee by ID---");
				System.out.println("Enter the Employee ID to update: ");
				int updateId = sc.nextInt();

				System.out.println("Enter the new Name: ");
				String newName = sc.next();
				System.out.println("Enter the new Salary: ");
				int newSalary = sc.nextInt();

				Employee updatedEmployee = new Employee(updateId, newName, newSalary);
				emp.UpdateEmployee(updatedEmployee);

				System.out.println("Employee with ID " + updateId + " has been updated.");
				break;

			case 3:
				System.out.println("----Delete Employee by ID---");
				System.out.println("Enter the Employee ID to delete: ");
				int deleteId = sc.nextInt();

				Boolean deleted = emp.deleteemployee(deleteId);
				if (!deleted) {
					System.out.println("Employee with ID " + deleteId + " has been deleted.");
				} else {
					System.out.println("Employee with ID " + deleteId + " not found.");
				}
				break;

			case 4:
				if (num == 0) {
					System.out.println("---Employee List---");
				} else {
					emp.showemployee();

				}
				break;

			case 5:
				System.out.println("----Search Employee By ID---");
				System.out.println("Enter the Employee ID to search: ");
				int searchId = sc.nextInt();
				Employee foundEmployee = emp.searchEmployeeById(searchId);
				if (foundEmployee != null) {
					System.out.println("Employee found: " + foundEmployee);
				} else {
					System.out.println("Employee not found with ID: " + searchId);
				}
				break;

			default:
				System.out.println("Invalid choice!");
			}

			System.out.println("Do you want to continue (Y/N)?");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
	}
}
