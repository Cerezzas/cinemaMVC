package az.coders.spring.CINEMA_MVC.services.impl;

import az.coders.spring.CINEMA_MVC.domains.Location;
import az.coders.spring.CINEMA_MVC.repositories.LocationRepository;
import az.coders.spring.CINEMA_MVC.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;
    @Override
    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocationById(Integer id) {
        return locationRepository.findById(id).get();
    }
}
