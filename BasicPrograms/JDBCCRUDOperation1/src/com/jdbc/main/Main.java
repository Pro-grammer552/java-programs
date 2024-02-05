package com.jdbc.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.model.Employee;
import com.jdbc.service.DataBaseService;

public class Main {

	public static void main(String[] args) throws SQLException {

		DataBaseService db = new DataBaseService();

		Scanner sc = new Scanner(System.in);

		boolean isrun = true;

		while (isrun) {
			System.out.println("Enter The Choice :");
			System.out.println("1.Insert ");
			System.out.println("2.Select All");
			System.out.println("3.Select Employee By Id");
			System.out.println("4.Delete Employee ");
			System.out.println("5.Update Employee :");
			System.out.println("6.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {

				System.out.println("Name.Address,Salary");

				db.insertEmployee(new Employee(sc.next(), sc.next(), sc.nextInt()));

				System.out.println(choice);
				break;
			}
			case 2: {
				db.getAll();
				System.out.println("Done.......");
				break;
			}
			case 3: {

				System.out.println("Enter The which Id Youn Want :");
				int id = sc.nextInt();

				db.searchById(id);
				// System.out.println(choice);
				break;
			}
			case 4: {
				System.out.println("Enter The which Id Youn Want to delete :");
				int id = sc.nextInt();
				db.deleteByid(id);
				System.out.println("Successfully Deleteted...");
				break;
			}
			case 5: {
				System.out.println("Enter ID :");
				int id=sc.nextInt();
				
				
			System.out.println("Enter name,address,salary");
				
				db.updateById(id,new Employee(sc.next(), sc.next(), sc.nextInt()));
				System.out.println(choice);
				break;
			}
			case 6: {
				System.out.println("Thank You visit again....");
				isrun = false;
				break;
			}
			default:
				System.out.println("Incorrect Choice");
				break;

			}

		}
		sc.close();

	}

}
