package circular_linked_list.online_ticket_reservation_system;

public class Main {

        public static void main (String[]args){
            TicketReservation system = new TicketReservation();

            system.addTicket(1, "Alice", "Movie A", "A1", "10:00 AM");
            system.addTicket(2, "Bob", "Movie B", "B1", "11:00 AM");
            system.addTicket(3, "Charlie", "Movie A", "A2", "10:30 AM");

            system.displayTickets();

            system.searchTicket("Alice", null);
            system.countTickets();

            system.removeTicket(2);
            system.displayTickets();
        }
    }

