package az.coders.spring.CINEMA_MVC.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dates")
@Entity
public class DateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dateId;
    private Date date;
}
