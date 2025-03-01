package az.coders.spring.CINEMA_MVC.services.impl;

import az.coders.spring.CINEMA_MVC.domains.Language;
import az.coders.spring.CINEMA_MVC.repositories.LanguageRepository;
import az.coders.spring.CINEMA_MVC.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public Language addLanguage(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    @Override
    public Language getLanguageById(Integer id) {
        return languageRepository.findById(id).get();
    }
}
