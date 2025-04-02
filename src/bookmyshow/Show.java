package bookmyshow;

import java.util.Date;
import java.util.Map;

public class Show {
    private final Date startTime;
    private final Date endTime;
    private final String id;
    private final Movie movie;
    private final Cinema cinema;
    private final Map<String,Seat> seats;

    public Show(String id, Movie movie, Cinema cinema, Map<String,Seat> seats, Date startTime, Date endTime) {
        this.id = id;
        this.movie = movie;
        this.cinema = cinema;
        this.seats = seats;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public String getId() {
        return id;
    }
    public Movie getMovie() {
        return movie;
    }
    public Cinema getCinema() {
        return cinema;
    }
    public Map<String,Seat> getSeats() {
        return seats;
    }
}
