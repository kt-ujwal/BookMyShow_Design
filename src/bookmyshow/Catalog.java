package bookmyshow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalog implements Search{
    private List<Movie> movies;

    public Catalog(List<Movie> movies) {
        this.movies = movies;
    }
    @Override
    public List<Movie> searchByTitle(String title) {
        return movies.stream().filter(movie -> movie.getTitle().equals(title)).collect(Collectors.toList());
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return movies.stream().filter(movie -> movie.getGenre().equals(genre)).collect(Collectors.toList());
    }

    @Override
    public List<Movie> searchByRelease(Date releaseDate) {
        return movies.stream().filter(movie -> movie.getReleaseDate().equals(releaseDate)).collect(Collectors.toList());
    }

    @Override
    public List<Movie> searchByCity(String city) {
        List<Movie> moviesInCity = new ArrayList<>();
        for (Movie movie : movies) {
            List<City> cityList = movie.getCitiesAvailable();
            for (City city1 : cityList) {
                if (city1.getCity().equals(city)) {
                    moviesInCity.add(movie);
                }

            }
        }
        return moviesInCity;
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return movies.stream().filter(movie->movie.getLanguage().equals(language)).collect(Collectors.toList());
    }

    public List<Movie> getMovies(){
        return movies;
    }
}
