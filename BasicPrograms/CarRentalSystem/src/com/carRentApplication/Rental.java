package com.carRentApplication;

public class Rental {

	private Car Car;
	private Customer Customer;

	private int days;

	public Rental(Car car, Customer customer, int days) {
		super();
		Car = car;
		Customer = customer;
		this.days = days;
	}

	public Car getCar() {
		return Car;
	}

	public void setCar(Car car) {
		Car = car;
	}

	public Customer getCustomer() {
		return Customer;
	}

	public void setCustomer(Customer customer) {
		Customer = customer;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
