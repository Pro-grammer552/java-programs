package com.labCb;

import java.util.ArrayList;

class Employeedata {
	int eid;
	String enam;
	int salary;

	Employeedata() {

	}

	public Employeedata(int eid, String enam, int salary) {

		this.eid = eid;
		this.enam = enam;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEnam() {
		return enam;
	}

	public void setEnam(String enam) {
		this.enam = enam;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [eid=" + eid + ", enam=" + enam + ", salary=" + salary + "]\n";
	}

}

class DepartmentData {
	int deptid;
	String deptname;
	ArrayList<Employeedata> elist;

	public DepartmentData() {

	}

	public DepartmentData(int deptid, String deptname, ArrayList<Employeedata> elist) {

		this.deptid = deptid;
		this.deptname = deptname;
		this.elist = elist;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public ArrayList<Employeedata> getElist() {
		return elist;
	}

	public void setElist(ArrayList<Employeedata> elist) {
		this.elist = elist;
	}

	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", elist=" + elist + "]\n";
	}

}

public class ArryListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DepartmentData> d = new ArrayList<DepartmentData>();

		ArrayList<Employeedata> ee = new ArrayList<Employeedata>();

		Employeedata e1 = new Employeedata(1, "abhi", 890000);
		Employeedata e2 = new Employeedata(2, "subodh", 460000);
		ee.add(e1);
		ee.add(e2);

		

		ArrayList<Employeedata> ee1 = new ArrayList<Employeedata>();

		Employeedata e4 = new Employeedata(3, "ganesh", 45000);
		Employeedata e5 = new Employeedata(4, "rahul", 87000);
		ee1.add(e4);
		ee1.add(e5);

		DepartmentData dept2 = new DepartmentData(2, "Computer", ee1);

		d.add(dept2);

		System.out.println(d);

		System.out.println("Employees having salary >800000: ");
		for (int i = 0; i < d.size(); i++) {
			ArrayList<Employeedata> dep = d.get(i).getElist();
			for (int j = 0; j < dep.size(); j++) {
				if (dep.get(j).getSalary() > 800000) {
					System.out.println(dep.get(j));
				}
			}

		}

	}

}
