package com.demo.crudd;

import java.util.List;

public interface CutomerDao {

	public void addcustomer(Customer c);

	public void updatecustomer(Customer c);

	public void deletecustomer(int cid);

	public List<Customer> showcustomerList(int cid);

}
