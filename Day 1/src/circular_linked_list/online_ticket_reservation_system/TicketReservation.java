package circular_linked_list.online_ticket_reservation_system;

class TicketReservation {
    private TicketNode last;

    public TicketReservation() {
        this.last = null;
    }

    // Add a new ticket reservation
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = last.next, prev = last;
        do {
            if (current.ticketId == ticketId) {
                if (current == last) {
                    last = (last == last.next) ? null : prev;
                }
                prev.next = current.next;
                System.out.println("Ticket " + ticketId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode temp = last.next;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String customerName, String movieName) {
        if (last == null) {
            System.out.println("No tickets to search.");
            return;
        }

        TicketNode temp = last.next;
        boolean found = false;
        do {
            if ((customerName != null && temp.customerName.equals(customerName)) ||
                    (movieName != null && temp.movieName.equals(movieName))) {
                System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != last.next);

        if (!found) {
            System.out.println("No tickets found.");
        }
    }

    // Calculate the total number of booked tickets
    public void countTickets() {
        if (last == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = last.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != last.next);

        System.out.println("Total Tickets: " + count);
    }
}