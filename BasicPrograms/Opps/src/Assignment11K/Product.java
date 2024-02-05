package Assignment11K;

import java.util.Scanner;

/*
 * 
 write a code to create a product class product has id, name price and quantity 
create first method to accept the product details 
create second method to calculate the total bill if quantity more than zero 
otherwise display errror message and 
create third method all the project detail including bill
 */

public class Product {

	int id;
	String Name;
	int Price;
	int Quantity;

	public void Display() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id :");
		id = sc.nextInt();

		System.out.print("Enter the Name :");
		Name = sc.next();

		System.out.print("Enter the Price :");
		Price = sc.nextInt();

		System.out.print("Enter the Quantity :");
		Quantity = sc.nextInt();

	}

	double TotalBill;

	public void DisplayDetails() {
		TotalBill = Price * Quantity;
	}

	public void CalculateBill() {

		if (Quantity > 0) {
			System.out.println("Total Bill :" + TotalBill);

		} else {

			System.out.println("Error......!Quantity should be greater than Zero");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		p.Display();
		p.DisplayDetails();
		p.CalculateBill();

	}

}
