package bf.sagen.logis_bf.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Courses {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id_course;
    private double prix;
    private LocalDate date ;
    private int distance_tot;

    @ManyToOne
    private Camions camions;

    @ManyToMany
    private List<Trajet> trajets  = new ArrayList<>();;

    @ManyToOne
    private Users client;

}
