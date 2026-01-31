package Thread;

public class Main {

    public static void main(String[] args) {

        MovieTicketsBooking booking = new MovieTicketsBooking(10);

        BookingThread t1 = new BookingThread(booking, "Sudarshan", 4);
        BookingThread t2 = new BookingThread(booking, "Sakshi", 5);
        BookingThread t3 = new BookingThread(booking, "Karan", 3);

        t1.start();
        t2.start();
        t3.start();
    }
}
