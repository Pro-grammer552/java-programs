package com.LinkedHashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class CustomerMain {

	public static void main(String[] args) {
		HashSet<Customer> hh = new HashSet<Customer>();

		hh.add(new Customer(105, "Suraj", 20));
		hh.add(new Customer(102, "Saurabh", 30));
		hh.add(new Customer(103, "Subhodh", 40));
		hh.add(new Customer(104, "keshav", 50));
		hh.add(new Customer(105, "Ss", 60));
		hh.add(new Customer(105, "Ss", 60));
		hh.add(new Customer(105, "Ss", 60));

		for (Customer c : hh) {
			System.out.println(c);
		}

		TreeSet<Customer> tset = new TreeSet<Customer>(hh);
		System.out.println("\nTreeSet Contents:");
		for (Customer c : tset) {
			System.out.println(c);
		}

	}

}
