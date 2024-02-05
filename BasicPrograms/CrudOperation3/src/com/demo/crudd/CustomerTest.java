package com.demo.crudd;

import com.demo.crudd.*;

import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class CustomerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch;
		List<Customer> l = null;
		Customer c = null;
		CustomerDaoImple cdi = new CustomerDaoImple();

		do {

			System.out.println("1.Add Customer\n2.Update Customer\n3.Delete Customer\n4.Display");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:

				System.out.println("Enter The Id");
				int id = sc.nextInt();
				System.out.println("Enter The Name");
				String name = sc.next();
				System.out.println("Enter The City");
				String city = sc.next();
				c=new Customer(id, name, city);
				cdi.addcustomer(c);

				break;
			case 2:
				System.out.println("Enter new id");
				int did=sc.nextInt();

				//cdi.updatecustomer(c);
				break;
			case 3:
				System.out.println("Enter new id");
				int cid=sc.nextInt();
				cdi.deletecustomer(cid);
				break;
			case 4:
				
				cdi.showcustomerList();
				break;
			case 5:
				break;

			default:
				System.out.println("Invalid Choice....");
			}
		} while (ch != 0);

	}

}
