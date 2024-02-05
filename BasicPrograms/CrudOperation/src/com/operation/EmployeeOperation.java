package com.operation;

import com.pojo.*;

public class EmployeeOperation {
	Employee[] emparr;
	int index, i, len;

	public EmployeeOperation() {
		emparr = new Employee[5];
		index = 0;
	}

	public void addemployee(Employee e, int num) {
		emparr[index] = e;
		System.out.println("Employee Addedd at index :" + index);
		index++;
	}

	public void showemployee() {
		len = index;
		for (int i = 0; i < len; i++) {
			System.out.println(emparr[i]);
		}

	}

	public boolean deleteemployee(int id) {
		for (int i = 0; i < index; i++) {
			if (emparr[i].getEid() == id) {
				emparr[i] = null;

			}
		}
		return false;
	}

	public void UpdateEmployee(Employee e) {
		for (int i = 0; i < index; i++) {
			if (emparr[i].getEid() == e.getEid()) {
				emparr[i] = e;

			}

		}

	}

	public Employee searchEmployeeById(int employeeId) {
		for (int i = 0; i < index; i++) {
			if (emparr[i].getEid() == employeeId) {
				return emparr[i];
			}
		}
		return null;
	}
}