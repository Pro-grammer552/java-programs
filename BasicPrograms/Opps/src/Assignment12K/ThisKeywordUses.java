package Assignment12K;

public class ThisKeywordUses {

	int x;
	int y;
	public void add(int x,int y)
	
	{
		this.x=x;
		this.y=y;
				
	}
	
	public void sub()
	{
		System.out.println(x-y);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ThisKeywordUses t=new ThisKeywordUses();
		t.sub();
		

	}

}
