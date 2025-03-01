package az.coders.spring.CINEMA_MVC.repositories;

import az.coders.spring.CINEMA_MVC.domains.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location, Integer> {

    Location save(Location location);

    List<Location> findAll();

    Optional<Location> findById(Integer id);
}
