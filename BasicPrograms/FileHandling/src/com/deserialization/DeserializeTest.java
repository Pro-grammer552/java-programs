package com.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
class Employee implements Serializable{

	int eid;
	String ename;
	double esal;
	//transient String epass;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}


public class DeserializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis;
		ObjectInputStream oin;
		Employee emp;
		
		try {
			fis=new FileInputStream("emp.ser");
			oin=new ObjectInputStream(fis);
			emp=(Employee)oin.readObject();
			System.out.println(emp);
			oin.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

