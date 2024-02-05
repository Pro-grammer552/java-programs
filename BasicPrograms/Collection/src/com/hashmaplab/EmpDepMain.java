package com.hashmaplab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class EmpDepMain {

	public static void main(String[] args) {

		ArrayList<Employee> e = new ArrayList<>();
		e.add(new Employee(101, "Suraj", 10000));
		e.add(new Employee(103, "Ss", 20000));
		e.add(new Employee(102, "S", 30000));

		ArrayList<Employee> e1 = new ArrayList<>();
		e1.add(new Employee(101, "rakeh", 50000));
		e1.add(new Employee(103, "Subhod", 20000));
		e1.add(new Employee(102, "kkk", 30000));

		Department d1 = new Department(1, "Hr");
		Department d2 = new Department(2, "sales");

		HashMap<Department, ArrayList<Employee>> h = new HashMap<>();

		h.put(d1, e);
		// h.put(d1, e1);
		// h.put(d2, e);
		h.put(d2, e1);

		// System.out.println(h);

		HashMap<String, Integer> a = new HashMap<String, Integer>();
		for (Entry<Department, ArrayList<Employee>> aa : h.entrySet()) {
			Department d = aa.getKey();
			String dname = d.getName();

			ArrayList<Employee> emp = aa.getValue();

			// System.out.println(emp);
			int max = Integer.MIN_VALUE;

			// System.out.println(d.getName());
			for (Employee eee : emp) {
				if (eee.getSalary() > max) {
					max = eee.getSalary();
				}
			}
			System.out.println(max);
			a.put(dname, max);
		}
		System.out.println(a);
	}
}