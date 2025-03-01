package az.coders.spring.CINEMA_MVC.controllers;

import az.coders.spring.CINEMA_MVC.domains.Location;
import az.coders.spring.CINEMA_MVC.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    LocationService locationService;


    @GetMapping
    public String getAllLocations(Model model) {
        List<Location> locations = locationService.getAllLocations();
        model.addAttribute("locations", locations);
        return "locations";
    }

    @GetMapping("/{id}")
    public String getLocationById(@PathVariable Integer id, Model model) {
        Location location = locationService.getLocationById(id);
        model.addAttribute("location", location);
        return "locations";
    }



}
