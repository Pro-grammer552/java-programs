package com.jdbc.util;

public class dataQuery {

	public static String insertQuery() {
		return "insert into Employee_info(employee_name,employee_address,employee_salary)values(?,?,?)";
	}

	public static String getquery() {
		return "select * from Employee_info";
	}

	public static String search() {
		return "select * from Employee_info where employee_id=?";
	}

	public static String delete() {
		return "delete from Employee_info where employee_id=?";
	}

	public static String update() {
		return "UPDATE Employee_info SET employee_name=?, employee_address=?, employee_salary=? WHERE employee_id=?";
	}

}
