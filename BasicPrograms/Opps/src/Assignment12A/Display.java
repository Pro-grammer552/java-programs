package Assignment12A;

public class Display {
	
	
	

	int id;
	String Name;
	double Price;
	

	public void displayItem(int Eid,String EName,double EPrice) {
		id=Eid;
		Name=EName;
		Price=EPrice;
	
		
		
	}
		public void displayValue()
		{
		System.out.print(id+" "+Name+" "+Price+" ");
		}
	

	public static void main(String[] args) {
	
		Display d=new Display();
		d.displayValue();
		d.displayItem(101, "Suraj",100);
		
		
		
	}

}
