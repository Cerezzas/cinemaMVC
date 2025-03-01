package az.coders.spring.CINEMA_MVC.services.impl;

import az.coders.spring.CINEMA_MVC.domains.DateEntity;
import az.coders.spring.CINEMA_MVC.repositories.DateRepository;
import az.coders.spring.CINEMA_MVC.services.DateEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateEntityServiceImpl implements DateEntityService {
    @Autowired
    DateRepository dateRepository;

    @Override
    public DateEntity addDateEntity(DateEntity dateEntity) {
        return dateRepository.save(dateEntity);
    }

    @Override
    public List<DateEntity> getAllDateEntities() {
        return dateRepository.findAll();
    }

    @Override
    public DateEntity getDateEntityById(Integer id) {
        return dateRepository.findById(id).get();
    }


}
