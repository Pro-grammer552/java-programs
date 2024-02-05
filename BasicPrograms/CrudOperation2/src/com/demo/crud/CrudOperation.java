package com.demo.crud;

import java.util.*;

public class CrudOperation {

	public static void main(String[] args) {

		List<Employee> e = new ArrayList<Employee>(); 
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Update");
			System.out.println("0. Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter The Id");
				int id = sc.nextInt();
				System.out.println("Enter The Name");
				String name = sc.next();
				System.out.println("Enter The Salaray");
				int Salary = sc.nextInt();

				e.add(new Employee(id, name, Salary));

				break;
			case 2:

				Iterator<Employee> i = e.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				break;
			case 3:
				System.out.println("Enter the ID of the employee to delete: ");
				int deleteId = sc.nextInt();
				boolean found = false;
				i = e.iterator();
				while (i.hasNext()) {
					Employee emp = i.next();
					if (emp.getId() == deleteId) {
						i.remove();
						found = true;
					}
				}
				if (!found)

				{
					System.out.println("Element Not Found");
				} else {
					System.out.println("Deleted Sucessfully");
				}

				break;
			case 4:

				System.out.println("Enter the ID of the employee to Update: ");
				int UpdateId = sc.nextInt();
				
				for(Employee e1: e)
				{
					if(e1.getId()==UpdateId)
					{System.out.println("Enter The New Id");
			        int newId = sc.nextInt();
			        System.out.println("Enter The New Name");
			        String newName = sc.next();
			        System.out.println("Enter The New Salary");
			        int newSalary = sc.nextInt();

			        e1.setId(newId);
			        e1.setName(newName);
			        e1.setSalary(newSalary);

					}
					System.out.println("Updaed suceessfully");
				}
				
//				found = false;
//				i = e.iterator();
//				while (i.hasNext()) {
//					Employee emp = i.next();
//					if (emp.getId() == UpdateId) {
//						ListIterator<Employee> itr = e.listIterator();
//						while (itr.hasNext()) {
//							emp = itr.next();
//							System.out.println("Enter The NewId");
//							int eid = sc.nextInt();
//							System.out.println("Enter The NewName");
//							String ename = sc.next();
//							System.out.println("Enter The NewSal");
//							int esal = sc.nextInt();
//							itr.set(new Employee(eid, ename, esal));
//							found = true;
//						}
//					}
//				}
//
//				if (!found)
//
//				{
//					System.out.println("Element Not Found");
//				} else {
//					System.out.println("Updated Sucessfully");
//				}

				break;
			case 0:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
		} while (choice != 0);
	}
}
