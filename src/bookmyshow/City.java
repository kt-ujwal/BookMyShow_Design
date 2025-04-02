package bookmyshow;

import java.util.List;

public class City {
    private int totalCinemaHalls;
    private Address address;
    private List<CinemaHall> halls;

    public City(Address address) {
        this.address = address;
    }

    public Object getCity() {
        return address.getCity();
    }
}
