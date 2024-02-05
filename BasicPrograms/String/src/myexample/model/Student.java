package myexample.model;

public class Student {
	private int studentId;
	private String studentName;
	private int age;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {

		Student student = (Student) o;
		return studentId == student.studentId || studentName.equals(student.studentName) && age==student.age ;
	}

	@Override
	public String toString() {
		return "Student{" + "studentId=" + studentId + ", studentName='"
				+ studentName + '\'' 
				+ ", age=" + age + '}';
	}
}