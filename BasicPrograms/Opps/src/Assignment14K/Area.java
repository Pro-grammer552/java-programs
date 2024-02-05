package Assignment14K;

/*
 write code to overload area method to 
 calculate area of circle rectangle triangle square
 area of circle=3.14*r*r
area of rectangle=a=w*l
area of tringle=a=hb/2
area of square=a*a  
 */

public class Area {

	

	private static final String AreaOfcircle = null;

	public int Calculate(int r) {
		return (int) (3.14 * r * r);

	}

	public int Calculate(int w, int l) {

		return w * l;

	}

	public double Calculate(int h, double l) {
		return h * l / 2;
	}

	public float Calculate(float a) {
		return (float) a;
	}
	
	public String toString()
	{
		return (Calculate(10)+" "+Calculate(10, 20)+" "+Calculate(10, 20)+" "+Calculate(5));
	}

	public static void main(String[] args) {
		Area a = new Area();
		//a.display();

//		int AreaOfcircle = a.Calculate(10);
//		int AreaOfRectangle =a.;
//		int AreaOftriangle=a;
//		int AreaOfSquare =a.;
//		
//		System.out.println("Area Calculator Menu");
//		
//		
//		System.out.println("Area of circle : "+AreaOfcircle+"Area of rectangle : "+AreaOfRectangle+
//				" Area of tringle :"+AreaOftriangle+"Area of square  :"+AreaOfSquare+"");
//		
		
		System.out.println(a);
		

	}

}
