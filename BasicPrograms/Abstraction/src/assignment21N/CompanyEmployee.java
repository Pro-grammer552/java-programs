package assignment21N;

class PartTimeEmployee extends Employee {
	public PartTimeEmployee(String name, int id) {
		super(name, id);
	}

	@Override
	public int calculateSalary() {
		return getHoursWorked() * 200;
	}
}

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int id) {
		super(name, id);
	}

	@Override
	public int calculateSalary() {
		return getHoursWorked() * 500;
	}
}

public class CompanyEmployee {
	public static void main(String[] args) {
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("John", 1001);
		partTimeEmployee.setHoursWorked(40);

		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 1002);
		fullTimeEmployee.setHoursWorked(50);

		System.out.println("Part-time Employee:");
		System.out.println("Name: " + partTimeEmployee.getName());
		System.out.println("ID: " + partTimeEmployee.getId());
		System.out.println("Hours Worked: " + partTimeEmployee.getHoursWorked());
		System.out.println("Salary: Rs. " + partTimeEmployee.calculateSalary());

		System.out.println("\nFull-time Employee:");
		System.out.println("Name: " + fullTimeEmployee.getName());
		System.out.println("ID: " + fullTimeEmployee.getId());
		System.out.println("Hours Worked: " + fullTimeEmployee.getHoursWorked());
		System.out.println("Salary: Rs. " + fullTimeEmployee.calculateSalary());
	}
}