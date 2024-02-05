package com.demo.crudd;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImple {

	Customer c;
	List<Customer> list = new ArrayList<Customer>();

	public void addcustomer(Customer c) {

		list.add(c);

	}

	public void updatecustomer(Customer c,int did) {
		int index=0;
		for (Customer c : list) {
			index++;
			if(c.getId()==did)
			{
				
				list.set(index,did);
			}
		}

	}

	public void deletecustomer(int cid) {
		for (Customer c : list) {
			if(c.getId()==cid)
			{
				list.remove(list);
			}
		}

	}

	public List<Customer> showcustomerList() {

		for (Customer c : list) {
			System.out.println(c);
		}

		return null;

	}

}
