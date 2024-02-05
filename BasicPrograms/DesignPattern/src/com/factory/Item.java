package com.factory;

public class Item {

	private String Itemname;
	private double price;

	public Item(String itemname, double price) {
		super();
		Itemname = itemname;
		this.price = price;
	}

	public Item() {
		super();
	}

	public String getItemname() {
		return Itemname;
	}

	public double getPrice() {
		return price;
	}

	public void setItemname(String itemname) {
		Itemname = itemname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [Itemname=" + Itemname + ", price=" + price + "]";
	}

}