package Assignment11K;

import java.util.Scanner;

import Assignment15K.StaticOverloading;

/*
 * write code to create car class
 *  car has model number car name  car price 
 *  create 3 car and display details 
 */

public class Car {

	int CarModelNumber;
	String CarName;
	double CarPrice;
	static int a = 10;

	public void CarDetails(int id, String name, double price, int a)

	{
		CarModelNumber = id;
		CarName = name;
		CarPrice = price;
		this.a = a;

	}

	public void display() {
		System.out.println(CarModelNumber + " " + CarName + " " + CarPrice + " "+a);
	}

	public static void main(String[] args) {

	
		for (int i = 1; i <=3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the car model Number :");
			int CarModelNumber = sc.nextInt();

			System.out.print("Enter the car name :");
			String CarName = sc.next();

			System.out.print("Enter the car price :");
			double CarPrice = sc.nextDouble();
			int a=20;
			Car c = new Car();
			c.CarDetails(CarModelNumber, CarName, CarPrice,a);
			c.display();
			
		}

	}

}
