package bookmyshow;

import java.util.List;

public class Cinema {
    private final String id;
    private final String name;
    private final String location;
    private final List<CinemaHall> halls;

    public Cinema(String id, String name, String location, List<CinemaHall> halls) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.halls = halls;
    }
}
