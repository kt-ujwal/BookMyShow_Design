package bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class CinemaHall {
    private String name;
    private int totalSeats;
    private List<Seat> seats;
    private List<Show> shows;

    CinemaHall(String name, int totalSeats, List<Seat> seats, List<Show> shows) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.seats = seats;
        this.shows = shows;
    }
}
