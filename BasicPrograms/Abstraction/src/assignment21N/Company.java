package assignment21N;

/*
 A company has employees and wants to keep a track of their names,
  id and hours of work. The employees are specifically categorised
   into part-time and full-time. Salary needs to be calculated for both however,
    where part-time employees get 200 rs. Per hour and Full-time employees get 500 rs. 
    per hour. Write a program which does the same.
 */

class Employee {
	private String name;
	private int id;
	private int hoursWorked;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public int calculateSalary() {
		return 0; // To be overridden by subclasses
	}
}
