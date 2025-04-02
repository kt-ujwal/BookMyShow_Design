package bookmyshow;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MovieManagementService {
    private final List<Movie> movies;
    public static MovieManagementService movieManagementService;

    private MovieManagementService(){
        this.movies = new CopyOnWriteArrayList<Movie>();
    }


    public MovieManagementService getMovieMangementService(){
        if(movieManagementService == null){
            synchronized (MovieManagementService.class) {
                if(movieManagementService == null){
                    movieManagementService = new MovieManagementService();
                }
            }
        }
        return movieManagementService;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }
}
