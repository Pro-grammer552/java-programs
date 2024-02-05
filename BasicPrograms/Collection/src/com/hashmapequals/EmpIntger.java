package com.hashmapequals;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmpIntger {

	public static void main(String[] args) {
		HashMap<Employee, Integer> newMap = new HashMap<>();

		newMap.put(new Employee(101, "scsz", 6546), 100);
		newMap.put(new Employee(102, "sca", 6546), 100);
		newMap.put(new Employee(103, "ssdv", 6546), 200);
		newMap.put(new Employee(104, "scsz", 6546), 300);
		newMap.put(new Employee(101, "scsz", 6546), 100);

		for (Entry<Employee, Integer> mm : newMap.entrySet()) {
			System.out.println(mm.getValue() + " " + mm.getKey());

			int count = 1;
			if (newMap.containsKey(mm.getValue())) {

			} else {
				newMap.put(mm.getKey(), count);

			}
		}

	}

}