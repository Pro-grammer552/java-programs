package com.collectionss;

public class Food {

	private int foodid;
	private String foodname;
	private int foodprice;
	public Food() {
		super();
	}
	public Food(int foodid, String foodname, int foodprice) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", foodname=" + foodname + ", foodprice=" + foodprice + "]\n";
	}
	

}