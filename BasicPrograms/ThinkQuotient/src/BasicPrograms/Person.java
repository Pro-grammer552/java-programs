package BasicPrograms;

//class person

//id
//name
//balance
//acc n
//10000

public class Person {

	private int id;
	private String name;
	private int accNum;

	private final int balance = 1000;

	public Person(int id, String name, int accNum) {
		super();
		this.id = id;
		this.name = name;
		this.accNum = accNum;
	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getBalance() {
		return balance;
	}

}
