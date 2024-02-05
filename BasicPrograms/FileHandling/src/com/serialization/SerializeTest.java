package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.Serializable;

class Employee implements Serializable {

	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
}


public class SerializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos=new FileOutputStream("emp.ser");
			oos=new ObjectOutputStream(fos);
			
			Employee eobj=new Employee(1, "pooja", 15000);
			oos.writeObject(eobj);//employee object
			System.out.println("serialization completed");
			fos.close();
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
