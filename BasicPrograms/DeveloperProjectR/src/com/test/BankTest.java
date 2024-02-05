package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.UserDaoImp;
import com.pojo.User;

public class BankTest {

	public static void main(String[] args) {

		int choice;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----Welcome to Kuber Bank-----");
			System.out.println("1.Admin Log_in ");
			System.out.println("2.User Log_in");
			System.out.println("3.Exit");
			System.out.println("---------------------------------");

			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Admin UserMAil : ");
				String useremail = sc.next();
				System.out.println("Enter Admin-pass :");
				String pass = sc.next();

				AdminTest admin = new AdminTest();
				try {
					admin.adminLogin(useremail, pass);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter User-id : ");
				int userid = sc.nextInt();
				System.out.println("Enter Userpass :");
				String userpass = sc.next();

				UserTest user = new UserTest();
				UserDaoImp udao = new UserDaoImp();
				try {

					user.userLogin(userid, userpass);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// UserTest.main(null);
				break;
			case 3:
				System.out.println("---Thank You for Banking with Kuber Bank---");
				System.out.println("---Visit Again :-)---");

				System.exit(0);
				;

				break;

			}
			System.out.println("do you want to continue if yes enter y:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
}
