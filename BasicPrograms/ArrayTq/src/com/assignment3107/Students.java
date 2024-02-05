package com.assignment3107;

public class Students{
	  private int rollno;
	  private String name;
	  private double  marks;
	 public  Students(){
		  
	  }
	  public Students(int rollno,String name,double marks){
		  this.rollno=rollno;
		  this.name=name;
		  this.marks=marks;
	  }
	  
	  public void setrollno(int rollno) {
		  this.rollno=rollno;
	  }
	  public int getrollno() {
		  return rollno;
	  }
	  
	  
	  public void setname(String name) {
		  this.name=name;
	  }
	  public String getname() {
		  return name;
	  }
	  
	  
	  public void setmarks(double marks) {
		  this.marks=marks;
	  }
	  public double getmarks() {
		  return marks;
	  }
	  
	 public String  toString() {
		return "Rollno: "+rollno+"\nName: "+name+"\nMarks:"+marks;
		 
	 }
	  
	}