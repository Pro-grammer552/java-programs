package com.labPracticehashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EmpDepMain {

	public static void main(String[] args) {
		HashMap<Employee, Department> h = new HashMap<Employee, Department>();

		h.put(new Employee(101, "Suraj", 1000), new Department(1001, "IT"));
		h.put(new Employee(102, "keshav", 2000), new Department(1001, "IT"));
		h.put(new Employee(103, "rushi", 3000), new Department(1002, "cse"));
		h.put(new Employee(104, "saurabh", 1000), new Department(1002, "cse"));
		h.put(new Employee(105, "subhodh", 5000), new Department(1003, "mech"));
		h.put(new Employee(106, "sub", 6000), new Department(1003, "mech"));
		h.put(new Employee(107, "prasad", 3000), new Department(1002, "cse"));

		h.put(new Employee(108, "abc", 100000), new Department(1005, "Python"));

		HashMap<String, Integer> hh = new HashMap<String, Integer>();

		HashSet<String> hs = new HashSet<>();

		for (Map.Entry<Employee, Department> s1 : h.entrySet()) {
			hs.add(s1.getValue().getName());
		}
		System.out.println(hs);

		for (String departmentName : hs) {
			int maxSalary = Integer.MIN_VALUE;

			for (Map.Entry<Employee, Department> entry : h.entrySet()) {
				if (entry.getValue().getName().equals(departmentName)) {

					int salary = entry.getKey().getSalary();
					if (salary > maxSalary) {
						maxSalary = salary;
					}
				}
			}

			hh.put(departmentName, maxSalary);
		}

		System.out.println(hh);
	}
}
