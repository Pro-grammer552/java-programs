package Logical;

import java.util.Scanner;

public class Ticket {

	private int ticketid;
	private int price;
	static int availableticket;
	
	public int getTicketid() {
		return ticketid;
	}
	public int getPrice() {
		return price;
	}
	public static int getAvailableticket() {
		return availableticket;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void setAvailableticket(int availableticket) {
		if ( availableticket > 0)
		Ticket.availableticket = availableticket;
	}
	public int calculateTicket(int nooftickets) {
		if ( availableticket > 0) {
			availableticket -= nooftickets;
		    return  nooftickets*price;
		}else
			return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ticket t1 = new Ticket();
		int num =0;
		System.out.println("Enter number of booking:");
		int n = sc.nextInt();
		System.out.println("Enter available ticket:");
		int a = sc.nextInt();
		Ticket.setAvailableticket(a);
		while ( n > 0) {
//		System.out.println("Enter available ticket:");
//		int a = sc.nextInt();
//		Ticket.setAvailableticket(a);
		
		System.out.println("Enter the ticket id:");
		int i = sc.nextInt();
		t1.setTicketid(i);
		
		System.out.println("Enter Price:");
		int p = sc.nextInt();
		t1.setPrice(p);
		
		System.out.println("Enter number of tickets:");
		 num = sc.nextInt();
		
		 System.out.println("price:");
		 System.out.println(t1.calculateTicket(num));
			
		 System.out.println("Available tickets:");
		 System.out.println(Ticket.getAvailableticket());
		n--;
		}
		
	}}