package bookmyshow;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CinemaManagementService {
    public static CinemaManagementService cinemaManagementService;
    private final List<CinemaHall> cinemas;
    private final Map<String, Show> shows;
    private CinemaManagementService(){
        this.cinemas = new CopyOnWriteArrayList<>();
        this.shows = new ConcurrentHashMap<>();
    }
    public static CinemaManagementService getCinemaManagementService(){
        if(cinemaManagementService == null){
            synchronized (CinemaManagementService.class){
                if(cinemaManagementService == null){
                    cinemaManagementService = new CinemaManagementService();
                }
            }
        }
        return cinemaManagementService;
    }

    public void addCinema(CinemaHall cinema){
        this.cinemas.add(cinema);
    }
    public void addShow(Show show){
        this.shows.put(show.getId(), show);
    }

}
