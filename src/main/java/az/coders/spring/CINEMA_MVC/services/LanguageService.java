package az.coders.spring.CINEMA_MVC.services;

import az.coders.spring.CINEMA_MVC.domains.DateEntity;
import az.coders.spring.CINEMA_MVC.domains.Language;

import java.util.List;

public interface LanguageService {
    Language addLanguage(Language language);

    List<Language> getAllLanguages();

    Language getLanguageById(Integer id);
}
