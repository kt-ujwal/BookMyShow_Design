package bookmyshow;

import java.util.Date;
import java.util.List;

public class Movie {
    private final String title;
    private final String description;
    private final String language;
    private final String genre;
    private final String id;
    private final Date releaseDate;
    private final int durationInMinutes;
    private final List<City> citiesAvailable;
    private List<Show> shows;
    public Movie(String id, String title, String description, String language,String genre, Date releaseDate, int durationInMinutes, List<Show> shows, List<City> citiesAvailable) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.shows = shows;
        this.citiesAvailable = citiesAvailable;

    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getLanguage() {
        return language;
    }
    public String getGenre() {
        return genre;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }
    public List<City> getCitiesAvailable() {
        return citiesAvailable;
    }
}
