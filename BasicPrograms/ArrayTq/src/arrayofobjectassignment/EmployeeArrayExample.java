package arrayofobjectassignment;


/*
 . WAP to create Array of Employees and display the employee data by 
traversing array. Employee class has (id, name, salary)
2. Same Employee array but print only those employee who has salary greater 
than 10000.
3. WAP to create Array of Employees and display the employee data by 
traversing array. Employee class has (id, name, salary, Dept), Departments 
has (did, dname). Hint : Object inside object
4. For 3rd e.g. array print only those employees who works in “sales” 
department

 */

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
    Department dept;

    Employee(int id, String name, double salary, Department dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
    }
}

class Department {
    int did;
    String dname;

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department [did=" + did + ", dname=" + dname + "]";
    }
}

public class EmployeeArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Employee ID: ");
            int id = scanner.nextInt();

            System.out.print("Employee Name: ");
            String name = scanner.next();

            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Department DID: ");
            int did = scanner.nextInt();

            System.out.print("Department DName: ");
            String dname = scanner.next();

            Department dept = new Department(did, dname);
            employees[i] = new Employee(id, name, salary, dept);
        }

        scanner.close();

        System.out.println("\nEmployee Data with Salary > 10000:");
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].salary > 10000) {
                System.out.println(employees[i].toString());
            }
        }

        System.out.println("\nEmployees in Sales Department:");
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].dept.dname.equals("Sales")) {
                System.out.println(employees[i]);
            }
        }
    }
}


