package Assignment15K;

/*
 write class hotel
hotel id name and object of menu 
menu has menu id name and object of menu item
menu item has id name price
 */

class MenuItem {
	private int MenuId;
	private String name;
	private double price;

	public MenuItem(int MenuId, String name, double price) {
		this.MenuId = MenuId;
		this.name = name;
		this.price = price;
	}
	
	public String toString() 
	{
		return MenuId+"  "+name+"  "+price;
	}
	

}



	class Menu {
		private int MenuId;
		private String Name;
		private MenuItem menuItem;

		public Menu(int MenuId, String Name, MenuItem menuItem)
		{
			this.MenuId = MenuId;
			this.Name = Name;
			this.menuItem = menuItem;

		}
		public String toString()
		{
			return menuItem+" "+Name+" "+menuItem;
		}
		
	}

public class Hotel {
	
	private int Id;
	private String name;
	private Menu Menu;
	
	
	public Hotel(int Id,String name,Menu Menu)
	{
		this.Id=Id;
		this.name=name;
		this.Menu=Menu;
		
	}
	
	public String toString()
	{
		return Id+" "+name+" "+Menu;
	}
	
	
	public static void main(String[] args)
	{
		MenuItem m1=new MenuItem(1, "Burger", 59.99);
		Menu m2=new Menu(101,"Rice plate",m1);
		Hotel h3=new Hotel(1001,"J1", m2);
		System.out.println(h3);
		
		//System.out.println(m2);
		
		
		

	}

}
