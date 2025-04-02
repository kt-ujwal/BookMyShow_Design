package bookmyshow;

public class CardPayment implements Payment {

    @Override
    public boolean pay(Booking booking) {
        if (booking != null && booking.getStatus() == BookingStatus.PENDING) {
            booking.setBookingStatus(BookingStatus.CONFIRMED);
            return true;
        }
        assert booking != null;
        booking.setBookingStatus(BookingStatus.FAILED);
        return false;
    }

}
