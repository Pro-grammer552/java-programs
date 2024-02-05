package Assignment13A;

public class ConstructorChanining {

	int BikeNo;
	String color;
	int price;

	public ConstructorChanining() {
		this(101, "Volvo", 20000);
		System.out.println("Default");
	}

	public ConstructorChanining(int BikeNo, String color, int price) {
		this.BikeNo = BikeNo;
		this.color = color;
		this.price = price;

	}

	public void m1() {
		System.out.println("------------------");
		System.out.print(this.BikeNo + " " + this.color + " " + this.price);
	}

	public void m2(int price)

	{
		this.m1();
		this.price = price;
	}
	
//	public void m3()
//	{
//		System.out.println(this);
//	}

	public static void main(String[] args) {

		ConstructorChanining cc = new ConstructorChanining();

		//System.out.println(cc);
		
		
		System.out.println(cc.BikeNo);
		System.out.println(cc.color);
		System.out.println(cc.price);

		
		//cc.m3();
		cc.m2(102);
		//cc.m1();

	}

}
