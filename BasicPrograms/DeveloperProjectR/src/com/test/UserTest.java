package com.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.AdminDaoImp;
import com.dao.UserDaoImp;
import com.dao.Userdao;
import com.pojo.Account;
import com.pojo.User;

public class UserTest {

	static UserDaoImp userdao = new UserDaoImp();

	public void userLogin(int userid, String userpass) throws SQLException {
		User user = userdao.searchUser(userid, userpass);

		if (user != null) {
			UserTest.main(user);
		} else {
			System.out.println("User Not found");
		}
	}

	static int uid;

	public void userid(int id) {
		uid = id;
	}

	public static void main(User user) {

		int userid = user.getUserid();
		Account account = user.getAccount();

		int accno = account.getAccountno();
		int choice;
		char ch;
		boolean result;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----Welcome to Coder Bank-----");
			System.out.println("---------User Log-in----------");
			System.out.println("1.Show Account Details");
			System.out.println("2.Deposit Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Transfer Amount");
			System.out.println("5.Show Balance");
			System.out.println("6.Add Payee");
			System.out.println("7.Log-out");
			System.out.println("---------------------------------");

			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("---User Account Details---");
				try {
					User detail = userdao.showAccountDetails(userid);
					System.out.println(detail);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 2:
				System.out.println("---Deposit Amount---");
				System.out.println("Enter Deposit Amount: ");
				Double amount = sc.nextDouble();
				try {
					result = userdao.depositAmount(userid, amount);
					if (result) {
						System.out.println("Deposit Successfull....");
					} else {
						System.out.println("Deposit faild....");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				System.out.println("---Withdraw Amount---");
				System.out.println("Enter Deposit Amount: ");
				Double amounts = sc.nextDouble();
				try {
					result = userdao.withdrawAmount(userid, amounts);
					if (result) {
						System.out.println("Withdraw Successfull....");
					} else {
						System.out.println("Withdraw faild....");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 4:
				System.out.println("---Transfer Amount---");

				System.out.println("Enter Account No :");
				int baccno = sc.nextInt();
				System.out.println("Enter Amount:");
				Double tamount = sc.nextDouble();
				try {
					result = userdao.transferAmount(userid, baccno, tamount);
					if (result) {
						System.out.println("Transfer Successfull....");
					} else {
						System.out.println("Transfer faild....");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 5:
				System.out.println("---Account Balance---");
				try {
					userdao.showBalance(userid);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 6:
				System.out.println("---Add Payee---");

				break;
			case 7:
				System.out.println("---Loggin out---");
				BankTest.main(null);
				System.exit(0);
				break;

			}
			System.out.println("do you want to continue if yes enter y:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
