package com.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserNamePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Map<Integer, String> userpass = new HashMap<Integer, String>();
		System.out.println("Set my Username");
		Integer inttt = sc.nextInt();
		System.out.println("Set my Password");
		String sss = sc.next();

		userpass.put(inttt, sss);
		// userpass.put(1015, "Su");

		System.out.println("Enter the username");
		int username = sc.nextInt();
		System.out.println("Enter the password");
		String password = sc.next();

		for (Map.Entry<Integer, String> entry : userpass.entrySet())

			if (userpass.containsKey(username) && userpass.containsValue(password)) {
				System.out.println("Login Succesfully");
				break;
			} else {
				System.out.println("Invalid USername && PassWord");
				break;
				
				
				
			}
	}

//			if (entry.getKey().equals(username) || entry.getValue().equals(password)) {
//				System.out.println("Login Succesfully");
//			} else {
//				System.out.println("Invalid USername && PassWord");
//			}

}
