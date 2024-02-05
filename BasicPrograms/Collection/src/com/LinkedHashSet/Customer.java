package com.LinkedHashSet;

public class Customer implements Comparable<Customer> {

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Customer other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Customer(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
