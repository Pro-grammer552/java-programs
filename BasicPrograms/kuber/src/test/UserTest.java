package test;

import java.sql.SQLException;
import java.util.Scanner;
import dao.UserDaoImpl;
import pojo.User;

public class UserTest {

	public static void main(String[] args) {
		int userid;
		String username;
		String useremail;
		String usercontact;
		String userdob;
		String userpan;
		String useraadhar;
		String useraddress;
		String userpass;
		String userrole;
		User user;
		UserDaoImpl userdao = new UserDaoImpl();
		boolean result;
		int choice;
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Email id:");
		String email = sc.next();
		System.out.println("Enter Password:");
		String check = "";
		String pass = sc.next();
		try {
			check = userdao.checkUserEmailPass(email, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (check.equals("Admin")) {
			do {
				System.out.println("----- Welcome to Kuberbank -----");
				System.out.println("1. Add user");
				System.out.println("2. Update user");
				System.out.println("3. Delete user");
				System.out.println("4. Show user list");
				System.out.println("5. Show user list with Account details");
				System.out.println("6. Search user by id");
				System.out.println("7. Search user by email");
				System.out.println("8. Search user by account");
				System.out.println("9. Search user by aadhar");
				System.out.println("10. Activate User");

				System.out.println("---------------------------------");

				System.out.println("Enter your choice:");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter user name:");
					username = sc.next();
					System.out.println("Enter user email:");
					useremail = sc.next();
					System.out.println("Enter user contact:");
					usercontact = sc.next();
					System.out.println("Enter user dob:");
					userdob = sc.next();
					System.out.println("Enter user pan:");
					userpan = sc.next();
					System.out.println("Enter user aadhar:");
					useraadhar = sc.next();
					System.out.println("Enter user address:");
					useraddress = sc.next();
					System.out.println("Enter user password:");
					userpass = sc.next();
					user = new User(username, useremail, usercontact, userdob, userpan, useraadhar, useraddress,
							userpass);
					try {
						result = userdao.addUser(user);
						if (result)
							System.out.println("User added successfully");
						else
							System.out.println("User not added");
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Enter user id:");
					userid = sc.nextInt();
					System.out.println("Enter user name:");
					username = sc.next();
					System.out.println("Enter user email:");
					useremail = sc.next();
					System.out.println("Enter user contact:");
					usercontact = sc.next();
					System.out.println("Enter user dob:");
					userdob = sc.next();
					System.out.println("Enter user pan:");
					userpan = sc.next();
					System.out.println("Enter user aadhar:");
					useraadhar = sc.next();
					System.out.println("Enter user address:");
					useraddress = sc.next();
					System.out.println("Enter user password:");
					userpass = sc.next();
					user = new User(userid, username, useremail, usercontact, userdob, userpan, useraadhar, useraddress,
							userpass);
					try {
						result = userdao.updateUser(user);
						if (result)
							System.out.println("User updated successfully");
						else
							System.out.println("User not added");
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 3:
					System.out.println("Enter user id:");
					userid = sc.nextInt();
					try {
						result = userdao.deleteUser(userid);
						System.out.println(result);
						if (!result)
							System.out.println("User deleted successfully");
						else
							System.out.println("User not deleted");
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try {
						userdao.showUserList();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 5:
					System.out.println("Account details:");
					try {
						userdao.showUserWithAccount();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 6:
					System.out.println("Enter user id:");
					userid = sc.nextInt();
					try {
						user = userdao.searchUserByUserid(userid);
						System.out.println(user);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 7:
					System.out.println("Enter Email:");
					useremail = sc.next();
					try {
						user = userdao.searchUserByEmail(useremail);
						System.out.println(user);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 8:
					System.out.println("Enter Account Number:");
					int accno = sc.nextInt();
					try {
						user = userdao.searchUserByAccountno(accno);
						System.out.println(user);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 9:
					System.out.println("Enter Aadhar Number:");
					useraadhar = sc.next();
					try {
						user = userdao.searchUserByAadhar(useraadhar);
						System.out.println(user);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 10:
					System.out.println("Enter Account Number");
					int accnoToActivate = sc.nextInt();
					try {
						userdao.ActivateUser(accnoToActivate);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;

				default:
					System.out.println("Invalid choice.");
				}

				System.out.print("Do you want to continue (y/n)? ");
				ch = sc.next().charAt(0);
			} while (ch == 'y' || ch == 'Y');
		} else if (check.equals("user")) {
			char ch1 = 0;
			do {
				System.out.println("1. Deposit");
				System.out.println("2. Credit");
				System.out.println("3. Transfer");

				System.out.println("4. Exit");
				System.out.println("5. Manage Payees");
				System.out.print("Enter your choice: ");
				int choice1 = sc.nextInt();
				switch (choice1) {
				case 1:
					System.out.println("---Deposit Money---");
					System.out.print("Enter the amount you want to deposit: ");
					double dmoney = sc.nextInt();
					try {
						userdao.DepositMoney(email, dmoney);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("---Withdraw Money---");
					System.out.print("Enter the amount you want to Credit: ");
					double cmoney = sc.nextInt();
					try {
						userdao.WithdrawMoney(email, cmoney);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 3:
					System.out.println("---Transfer Money---");
					System.out.print("Enter the Account Number you want to Transfer: ");
					int taccnumber = sc.nextInt();
					System.out.print("Enter the money you want to transfer: ");
					int tmoney = sc.nextInt();
					try {
						userdao.Transaction(email, taccnumber, tmoney);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.println("Exiting user operations.");
					return;
				case 5:

					PayeeManager payeeManager = new PayeeManager(email, userdao);
					payeeManager.managePayees();
					
					break;
				default:
					System.out.println("Invalid choice.");
				}

				System.out.print("Do you want to continue (y/n)? ");
				ch1 = sc.next().charAt(0);
			} while (ch1 == 'y' || ch1 == 'Y');
		} else {
			System.out.println("Enter valid id and password or Account is inactive.");
		}
	}
}
