package Assignment13K;

/*
 * write getter setter for the student has id name marks and percentage 
 boolean type of is place.
 */

public class Encapsulation {

	private int id;
	private String name;
	private int marks;
	private double percentage;
	private Boolean a = false;

	public void setid(int id) {
		this.id = id;

	}

	public void setname(String name) {
		this.name = name;

	}

	public void setmarks(int marks) {
		this.marks = marks;

	}

	public void setpercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public int getmarks() {
		return marks;
	}

	public double getpercentage() {
		return percentage;
	}

}
