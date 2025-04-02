package bookmyshow;

import java.util.List;

public class Booking {
    private final String id;
    private final User user;
    private final Show show;
    private final List<Seat> seats;
    private BookingStatus status;
    private final double totalPrice;

    public Booking(String id, User user, Show show, List<Seat> seats, BookingStatus status,double totalPrice) {
        this.id = id;
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.status = status;
        this.totalPrice = totalPrice;
    }
    public String getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public List<Seat> getSeats() {
        return seats;
    }
    public Show getShow() {
        return show;
    }
    public BookingStatus getStatus() {
        return status;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public BookingStatus getBookingStatus() {
        return status;
    }
    public void setBookingStatus(BookingStatus status) {
        this.status = status;
    }



}
