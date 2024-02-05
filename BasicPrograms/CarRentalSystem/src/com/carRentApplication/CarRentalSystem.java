package com.carRentApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystem {
	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rentals;

	public CarRentalSystem() {
		cars = new ArrayList<>();
		customers = new ArrayList<>();
		rentals = new ArrayList<>();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void rentCar(Car car, Customer customer, int days) {
		if (car.isAvailable()) {
			car.rent();
			rentals.add(new Rental(car, customer, days));
		} else {
			System.out.println("Car is not available for rent.");
		}
	}

	public void returnCar(Car car) {
		car.returnCar();
		Rental rentalToRemove = null;
		for (Rental rental : rentals) {
			if (rental.getCar() == car) {
				rentalToRemove = rental;
				break;
			}
		}
		if (rentalToRemove != null) {
			rentals.remove(rentalToRemove);
		} else {
			System.out.println("Car was not rented.");
		}
	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			displayMenu();

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				rentACar(scanner);
				break;
			case 2:
				returnACar(scanner);
				break;
			case 3:
				exit();
				return;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

	private void displayMenu() {
		System.out.println("===== Car Rental System =====");
		System.out.println("1. Rent a Car");
		System.out.println("2. Return a Car");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
	}

	private void rentACar(Scanner scanner) {
		System.out.println("\n== Rent a Car ==\n");
		System.out.print("Enter your name: ");
		String customerName = scanner.nextLine();

		System.out.println("\nAvailable Cars:");
		for (Car car : cars) {
			if (car.isAvailable()) {
				System.out.println(car.getId() + " - " + car.getBrand() + " " + car.getModel());
			}
		}

		System.out.print("\nEnter the car ID you want to rent: ");
		int carId = scanner.nextInt(); // Change the data type to String

		System.out.print("Enter the number of days for rental: ");
		int rentalDays = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		Customer newCustomer = new Customer((customers.size() + 1), customerName);
		addCustomer(newCustomer);

		Car selectedCar = null;
		for (Car car : cars) {
			if (car.getId() == (carId) && car.isAvailable()) {
				selectedCar = car;
				break;
			}
		}

		if (selectedCar != null) {
			double totalPrice = selectedCar.calculatePrice(rentalDays);
			System.out.println("\n== Rental Information ==\n");
			System.out.println("Customer ID: " + newCustomer.getCustomerId());
			System.out.println("Customer Name: " + newCustomer.getName());
			System.out.println("Car: " + selectedCar.getBrand() + " " + selectedCar.getModel());
			System.out.println("Rental Days: " + rentalDays);
			System.out.printf("Total Price: $%.2f%n", totalPrice);

			System.out.print("\nConfirm rental (Y/N): ");
			String confirm = scanner.nextLine();

			if (confirm.equalsIgnoreCase("Y")) {
				rentCar(selectedCar, newCustomer, rentalDays);
				System.out.println("\nCar rented successfully.");
			} else {
				System.out.println("\nRental canceled.");
			}
		} else {
			System.out.println("\nInvalid car selection or car not available for rent.");
		}
	}

	private void returnACar(Scanner scanner) {
		System.out.println("\n== Return a Car ==\n");
		System.out.print("Enter the car ID you want to return: ");
		int carId = scanner.nextInt();

		Car carToReturn = null;
		for (Car car : cars) {
			if (car.getId() == (carId) && !car.isAvailable()) {
				carToReturn = car;
				break;
			}
		}

		if (carToReturn != null) {
			Customer customer = null;
			for (Rental rental : rentals) {
				if (rental.getCar() == carToReturn) {
					customer = rental.getCustomer();
					break;
				}
			}

			if (customer != null) {
				returnCar(carToReturn);
				System.out.println("Car returned successfully by " + customer.getName());
			} else {
				System.out.println("Car was not rented or rental information is missing.");
			}
		} else {
			System.out.println("Invalid car ID or car is not rented.");
		}
	}

	private void exit() {
		System.out.println("\nThank you for using the Car Rental System!");
	}

	public static void main(String[] args) {
		CarRentalSystem rentalSystem = new CarRentalSystem();

		Car car1 = new Car(1, "Toyota", "Camry", 60.0, false);
		Car car2 = new Car(2, "Honda", "Accord", 70.0, false);
		Car car3 = new Car(3, "Mahindra", "Thar", 150.0, false);
		rentalSystem.addCar(car1);
		rentalSystem.addCar(car2);
		rentalSystem.addCar(car3);

		rentalSystem.menu();
	}
}
