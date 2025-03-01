package az.coders.spring.CINEMA_MVC.repositories;

import az.coders.spring.CINEMA_MVC.domains.DateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DateRepository extends JpaRepository<DateEntity, Integer> {

    DateEntity save(DateEntity dateEntity);

    List<DateEntity> findAll();

    Optional<DateEntity> findById(Integer id);
}
