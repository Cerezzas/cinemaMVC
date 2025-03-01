package az.coders.spring.CINEMA_MVC.controllers;

import az.coders.spring.CINEMA_MVC.domains.Movie;
import az.coders.spring.CINEMA_MVC.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;


    @GetMapping
    public String getAllMovies(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/{id}")
    public String getMovieById(@PathVariable Integer id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "movies";
    }




}
