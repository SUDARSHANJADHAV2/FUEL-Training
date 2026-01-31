package Thread;
public class BookingThread extends Thread {

    private MovieTicketsBooking booking;
    private String userName;
    private int seatsNeeded;

    public BookingThread(MovieTicketsBooking booking, String userName, int seatsNeeded) {
        this.booking = booking;
        this.userName = userName;
        this.seatsNeeded = seatsNeeded;
    }

    @Override
    public void run() {
        booking.bookmov_tickets(userName, seatsNeeded);
    }
}
