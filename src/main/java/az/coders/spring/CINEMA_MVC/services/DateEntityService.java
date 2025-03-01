package az.coders.spring.CINEMA_MVC.services;

import az.coders.spring.CINEMA_MVC.domains.DateEntity;
import az.coders.spring.CINEMA_MVC.repositories.DateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DateEntityService {
    DateEntity addDateEntity(DateEntity dateEntity);
    List<DateEntity> getAllDateEntities();

    DateEntity getDateEntityById(Integer id);

}
