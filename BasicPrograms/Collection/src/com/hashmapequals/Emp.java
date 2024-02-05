package com.hashmapequals;

import java.util.HashMap;
import java.util.Map;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee, String> e = new HashMap<Employee, String>();
		e.put(new Employee(101,"scsz",6546), "cs");
		e.put(new Employee(102,"sca",6546), "cs");
		e.put(new Employee(103,"ssdv",6546), "cs");
		e.put(new Employee(104,"scsz",6546), "cs");
		e.put(new Employee(101,"scsz",6546), "cs");
		
		for ( Map.Entry<Employee, String>m:e.entrySet()) {
			System.out.println(m.getValue()+" "+m.getKey());
		}
	}
}