package SundayAssignment16A;

public class Main {
    public static void main(String[] args) {
        int setAvailableTickets = 7;
        Ticket.setAvailableTickets(setAvailableTickets); // Set the availableTickets count

        Ticket ticket = new Ticket();
        ticket.setTicketid(123);
        ticket.setPrice(100);

        int noOfTicketsToBook = 6;
        int totalAmount = ticket.calculateTicketCost(noOfTicketsToBook);

        System.out.println("Ticket ID: " + ticket.getTicketid());
        System.out.println("Number of Tickets Booked: " + noOfTicketsToBook);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Available Tickets after Booking: " + Ticket.getAvailableTickets());
    }
}
