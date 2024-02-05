package com.bankpackage;

import java.util.Date;

public class Transaction {

	private int t_id;
	private String t_type;
	private double t_amount;
	private Date t_date;
	private int a_no;

	public Transaction()
	{
		super();
		
	}

	public Transaction(int t_id, String t_type, double t_amount, Date t_date,int a_no) 
	{
		super();
		this.t_id = t_id;
		this.t_type = t_type;
		this.t_amount = t_amount;
		this.t_date = t_date;
		this.a_no = a_no;

	}

	public int getT_id()
	{
		return t_id;
	}

	public void setT_id(int t_id) 
	{
		this.t_id = t_id;
	}

	public String getT_type() 
	{
		return t_type;
	}

	public void setT_type(String t_type) 
	{
		this.t_type = t_type;
	}

	public double getT_amount() 
	{
		return t_amount;
	}

	public void setT_amount(double t_amount) 
	{
		this.t_amount = t_amount;
	}

	public Date getT_date() 
	{
		return t_date;
	}

	public void setT_date(Date t_date) 
	{
		this.t_date = t_date;
	}

	public int getA_no() 
	{
		return a_no;
	}

	public void setA_no(int a_no)
	{
		this.a_no = a_no;
	}

	@Override
	public String toString() 
	{
		return "Transaction [t_id=" + t_id + ", t_type=" + t_type + ", t_amount=" + t_amount + ", t_date=" + t_date
				+ ", a_no=" + a_no + "]";
	}
}
