package az.coders.spring.CINEMA_MVC.controllers;

import az.coders.spring.CINEMA_MVC.domains.Language;
import az.coders.spring.CINEMA_MVC.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/languages")
public class LanguageController {

    @Autowired
    LanguageService languageService;

    @GetMapping
    public String getAllLanguages(Model model) {
        List<Language> languages = languageService.getAllLanguages();
        model.addAttribute("languages", languages);
        return "languages";
    }

    @GetMapping("/{id}")
    public String getLanguageById(@PathVariable Integer id, Model model) {
        Language language = languageService.getLanguageById(id);
        model.addAttribute("language", language);
        return "languages";
    }




}
