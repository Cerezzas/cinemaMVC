package az.coders.spring.CINEMA_MVC.controllers;

import az.coders.spring.CINEMA_MVC.domains.DateEntity;
import az.coders.spring.CINEMA_MVC.services.DateEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dates")
public class DateEntityController {

    @Autowired
    DateEntityService dateEntityService;

    @GetMapping
    public String getAllDates(Model model) {
        List<DateEntity> dates = dateEntityService.getAllDateEntities();
        model.addAttribute("dates", dates);
        return "dates";
    }

    @GetMapping("/{id}")
    public String getDateById(@PathVariable Integer id, Model model) {
        DateEntity date = dateEntityService.getDateEntityById(id);
        model.addAttribute("date", date);
        return "dates";
    }


}
