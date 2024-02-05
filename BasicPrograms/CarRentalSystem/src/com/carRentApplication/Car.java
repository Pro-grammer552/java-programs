package com.carRentApplication;

/*
 Features
 -Rent a car
 -Get Confirmation Slip
 -Use oops only
 -
 
 */

public class Car {

	private int Id;
	private String Model;
	private String Brand;
	private double BasePricePerDay;
	private boolean isAvailable;

	public Car() {
		super();
	}

	public Car(int id, String model, String brand, double basePricePerDay, boolean isAvailable) {
		super();
		this.Id = id;
		this.Model = model;
		this.Brand = brand;
		this.BasePricePerDay = basePricePerDay;
		this.isAvailable = true;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public double getBasePricePerDay() {
		return BasePricePerDay;
	}

	public void setBasePricePerDay(double basePricePerDay) {
		BasePricePerDay = basePricePerDay;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void rent() {
		isAvailable = false;
	}

	public void returnCar() {
		isAvailable = true;
	}

	public double calculatePrice(int rentalDays) {

		return rentalDays * BasePricePerDay;
	}

}
