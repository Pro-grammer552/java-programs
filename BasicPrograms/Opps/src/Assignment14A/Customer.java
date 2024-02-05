package Assignment14A;

public class Customer {

	private int Cid;
	private String cname;
	private int balance = 20000;
	int a;

	public void setCid(int id) {
		this.Cid = id;

	}

	public void cname(String cname) {
		this.cname = cname;

	}

	public int getCid() {
		return Cid;
	}

	public String getcname() {
		return cname;
	}

	public int balance() {
		return balance;
	}

	public void transfer(int cash) {
		System.out.println(balance - cash);
	}

}
