package com.bankpackage;

public class Register {
	
	private String c_name;
	private long c_phone; 
	private long a_no;
	private String c_email;
	private long balance;
	private String c_passward;
	private String a_type;
	
   
	public Register() {
		super();
		
	}
	
	public Register(String c_name, long c_phone, long a_no, String c_email, long balance, String c_passward,String a_type) throws EmailFormatException, PhoneNumberLengthException
	{
		super();
		this.c_name = c_name;
        if (!isValidPhoneNumber(c_phone))
        {
            throw new PhoneNumberLengthException("Invalid phone number length.");
        }

		this.c_phone = c_phone;
		this.a_no = a_no;
		if (!isValidEmail(c_email)) 
		{
            throw new EmailFormatException("Invalid email format.");
        }
		this.c_email = c_email;
		this.balance = balance;
		this.c_passward = c_passward;
		this.a_type = a_type;
	}

	public String getC_name() 
	{
		return c_name;
	}

	public void setC_name(String c_name) 
	{
		this.c_name = c_name;
	}

	public long getC_phone()
	{
		return c_phone;
	}

	public void setC_phone(long c_phone) 
	{
		this.c_phone = c_phone;
	}

	public long getA_no()
	{
		return a_no;
	}

	public void setA_no(long a_no) 
	{
		this.a_no = a_no;
	}

	public String getC_email() 
	{
		return c_email;
	}

	public void setC_email(String c_email) 
	{
		this.c_email = c_email;
	}

	public long getBalance() 
	{
		return balance;
	}

	public void setBalance(long balance)
	{
		this.balance = balance;
	}

	public String getC_passward() 
	{
		return c_passward;
	}

	public void setC_passward(String c_passward)
	{
		this.c_passward = c_passward;
	}

	public String getA_type() 
	{
		return a_type;
	}

	public void setA_type(String a_type) 
	{
		this.a_type = a_type;
	}

	@Override
	public String toString()
	{
		return "Register [c_name=" + c_name + ", c_phone=" + c_phone + ", a_no=" + a_no + ", c_email=" + c_email
				+ ", balance=" + balance + ", passward=" + c_passward + ", a_type=" + a_type + "]";
	}
	
	private boolean isValidEmail(String c_email) 
	{
        return c_email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
	
	private boolean isValidPhoneNumber(long phoneNumber)
	{
        String phoneStr = String.valueOf(phoneNumber);
        return phoneStr.length() == 10;
    }
}
