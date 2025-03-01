package az.coders.spring.CINEMA_MVC.services.impl;

import az.coders.spring.CINEMA_MVC.domains.Movie;
import az.coders.spring.CINEMA_MVC.repositories.MovieRepository;
import az.coders.spring.CINEMA_MVC.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Integer id) {
        return movieRepository.findById(id).get();
    }


}
