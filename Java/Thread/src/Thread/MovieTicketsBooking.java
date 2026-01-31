package Thread;


public class MovieTicketsBooking {

    private int availableSeats;

    public MovieTicketsBooking(int seats) {
        this.availableSeats = seats;
    }

    public synchronized void bookmov_tickets(String name, int seatRequire) {

        if (seatRequire <= availableSeats) {
            System.out.println(
                "User: " + name +
                " | Tickets Booked: " + seatRequire
            );

            availableSeats = availableSeats - seatRequire;

            System.out.println(
                "Tickets Left: " + availableSeats
            );
            System.out.println("---------------------------------");

        } else {
            System.out.println(
                "User: " + name +
                " | Requested: " + seatRequire +
                " | Booking Failed (Not enough seats)"
            );
            System.out.println(
                "Tickets Left: " + availableSeats
            );
            System.out.println("---------------------------------");
        }
    }
}
