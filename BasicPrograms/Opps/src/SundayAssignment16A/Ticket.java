package SundayAssignment16A;

/*
Ticket Calculation
Create a class Ticket with the following private variables
int ticketid;
int price;
static int availableTickets;
Include getters and setters methods in the Ticket class.

AvailableTickets should hold only positive value. Zero and negative values are not allowed.
(This logic should be checked inside the corresponding setter method)
 */

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		if (availableTickets >= 0) {
			Ticket.availableTickets = availableTickets;
		}
	}

	public int calculateTicketCost(int nooftickets) {
		if (nooftickets > 0 && nooftickets <= availableTickets) {
			availableTickets =availableTickets- nooftickets;
			return nooftickets * price;
		} else {
			return -1;
		}

	}

}






