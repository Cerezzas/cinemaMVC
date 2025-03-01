package az.coders.spring.CINEMA_MVC.repositories;

import az.coders.spring.CINEMA_MVC.domains.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

    Language save(Language language);

    List<Language> findAll();

    Optional<Language> findById(Integer id);
}
