package com.bankpackage;

public class Login {
	
	private long a_no;
	private String c_passward;
	
	public Login() 
	{
		super();
	}
	
	public Login(long a_no, String passward) 
	{
		super();
		this.a_no = a_no;
		this.c_passward = passward;
	}
	
	public long getA_no() 
	{
		return a_no;
	}
	public void setA_no(long a_no) 
	{
		this.a_no = a_no;
	}
	
	public String getC_passward()
	{
		return c_passward;
	}
	
	public void setC_passward(String passward) 
	{
		this.c_passward = passward;
	}
	
	@Override
	public String toString() 
	{
		return "Login [username=" + a_no + ", passward=" + c_passward + "]";
	}
}
