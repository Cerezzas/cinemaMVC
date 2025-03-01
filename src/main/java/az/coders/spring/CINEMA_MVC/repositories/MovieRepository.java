package az.coders.spring.CINEMA_MVC.repositories;


import az.coders.spring.CINEMA_MVC.domains.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie save(Movie movie);

    List<Movie> findAll();

    Optional<Movie> findById(Integer id);

}
