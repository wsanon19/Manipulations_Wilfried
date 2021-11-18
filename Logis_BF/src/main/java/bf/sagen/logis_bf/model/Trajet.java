package bf.sagen.logis_bf.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Trajet {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id_traj;
    private String Ville_dep;
    private String Ville_arr;
    private String etat;
    private int distance;
    private int duree;

    @ManyToMany (mappedBy = "trajets")
    private List<Courses> courses  = new ArrayList<>();;


}
