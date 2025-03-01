package az.coders.spring.CINEMA_MVC.services;

import az.coders.spring.CINEMA_MVC.domains.Language;
import az.coders.spring.CINEMA_MVC.domains.Location;

import java.util.List;

public interface LocationService {
    Location addLocation(Location location);

    List<Location> getAllLocations();

    Location getLocationById(Integer id);
}
