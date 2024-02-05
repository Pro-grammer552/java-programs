package com.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.model.Employee;
import com.jdbc.util.DatabaseUtil;
import com.jdbc.util.dataQuery;
import com.mysql.cj.jdbc.CallableStatement;

public class DataBaseService {

	public void insertEmployee(Employee emp) throws SQLException {

		// DatabaseUtil du=new DatabaseUtil();
		Connection c = DatabaseUtil.getConnection();

		PreparedStatement p = c.prepareStatement(dataQuery.insertQuery());
		p.setString(1, emp.getEmployeeName());
		p.setString(2, emp.getEmployeeAddress());
		p.setInt(3, emp.getEmployeeSalary());

		int result = p.executeUpdate();

		System.out.println("Count of rows :" + result);

		if (result > 0) {
			System.out.println("rows inserated");
		} else {
			System.out.println("not inserted...");
		}

		System.out.println("inserted sucessfully");
	}

	public void getAll() throws SQLException {

		Connection c = DatabaseUtil.getConnection();

		Statement st = c.createStatement();

		ResultSet rs = st.executeQuery(dataQuery.getquery());

		while (rs.next()) {
			System.out.println(rs.getInt(1)+" || "+rs.getString(2)+" || "+rs.getString(3)+" || "+rs.getString(4));

			System.out.println("------------------------------------");
		}

		System.out.println("Fetched sucessfully");
	}

	public void searchById(int id) throws SQLException {
		Connection c = DatabaseUtil.getConnection();

		PreparedStatement p = c.prepareStatement(dataQuery.search());
		p.setInt(1, id);

		ResultSet rs = p.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}

	}

	public void deleteByid(int id) throws SQLException {

		Connection c = DatabaseUtil.getConnection();

		PreparedStatement p = c.prepareStatement(dataQuery.delete());
		p.setInt(1, id);
		int r = p.executeUpdate();
		System.out.println(r);
		

	}
	
	public void updateById(int id,Employee emp) throws SQLException
	{
		
		Connection c = DatabaseUtil.getConnection();

		
		PreparedStatement p = c.prepareStatement(dataQuery.update());
      

        p.setString(1, emp.getEmployeeName());
        p.setString(2, emp.getEmployeeAddress());
        p.setInt(3, emp.getEmployeeSalary());
        p.setInt(4, id);
       int result = p.executeUpdate();

		if (result > 0) {

			System.out.println("Record updated");

		} else {
			System.out.println("Record not updated");
		}
		
	}
	

}
