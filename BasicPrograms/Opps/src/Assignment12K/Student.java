package Assignment12K;

import java.util.Scanner;

/*
create student class student having id name three subject marks 
ASSIGN Data to student 
calculate the percentage on the basis of marks and then display the result using
student imformation percentage and as per the student percentage grade 
 */

public class Student {

	int id;
	String name;
	double mark1, mark2, mark3;
	double percentage;



	public void declare(int Id, String dname, int i, int j, int k) {

		id = Id;
		name = dname;
		mark1 = i;
		mark2 = j;
		mark3 = k;

	}

	public void Display()

	{
		double percentage = ((mark1 + mark2 + mark3) / 3);
		System.out.println("percentage  :" + percentage + "%");

	}

	public void Grade() {
		if (percentage > 70) {
			System.out.println("Grade A" + percentage);
		} else {
			System.out.println("Fail");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Id :" );
		int id = sc.nextInt();

		System.out.print("Enter the name :" );
		String name = sc.next();

		System.out.print("Enter the mark1 :" );
		int mark1 = sc.nextInt();

		System.out.print("Enter the mark2 :" );
		int mark2 = sc.nextInt();

		System.out.print("Enter the mark3 :" );
		int mark3 = sc.nextInt();

		Student s1 = new Student();
		s1.declare(id, name, mark1,mark2, mark3);
		s1.Grade();
		s1.Display();
		
		

	}

}
