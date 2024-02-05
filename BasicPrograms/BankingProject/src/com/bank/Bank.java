package com.bank;

public class Bank {

	private int username;
	private String pass;

	public Bank(int username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}

	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
