package az.coders.spring.CINEMA_MVC.services;

import az.coders.spring.CINEMA_MVC.domains.Language;
import az.coders.spring.CINEMA_MVC.domains.Movie;

import java.util.List;

public interface MovieService {
    Movie addMovie(Movie movie);

    List<Movie> getAllMovies();

    Movie getMovieById(Integer id);
}
