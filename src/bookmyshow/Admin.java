package bookmyshow;

import java.util.List;

public class Admin extends Person {
    private List<Movie> movies;
    Admin(String name, Address address, String email, String phone) {
        super(name, address, email, phone);
    }

    public boolean addMovie(Movie movie){
        this.movies.add(movie);
        return true;
    }
    public List<Movie> getMovies(){
        return this.movies;
    }
    public boolean removeMovie(Movie movie){
        if(this.movies.contains(movie)){
            this.movies.remove(movie);
            return true;
        }
return false;
    }

    public boolean addShow(Show show, Movie movie){
        if(this.movies.contains(movie)){
            movie.addShow(show);
            return true;
        }
        return false;
    }
    public boolean removeShow(Show show,Movie movie){
        if(this.movies.contains(movie)){
            this.movies.remove(movie);
            return true;
        }
        return false;
    }

}
