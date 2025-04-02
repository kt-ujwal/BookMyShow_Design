package bookmyshow;

import java.util.Date;
import java.util.List;

public interface Search {
    public List<Movie> searchByTitle(String title);
    public List<Movie> searchByGenre(String genre);
    public List<Movie> searchByRelease(Date releaseDate);
    public List<Movie> searchByCity(String city);
    public List<Movie> searchByLanguage(String language);

}
