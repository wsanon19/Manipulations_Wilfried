package bf.sagen.logis_bf.model;

import lombok.*;
import org.springframework.http.ResponseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static javax.persistence.GenerationType.AUTO;
import static org.springframework.http.HttpStatus.OK;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Camions {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String nom;
    private boolean dispo;
    private String type;
    private double poid_nom;
    private double poid_ch;

    @ManyToOne
    private Produits prod;

    @OneToMany(mappedBy = "camions")
    private List<Courses> courses = new ArrayList<>();

    public void setCourses(Courses course) {
        this.courses.add(course);
    }

    @OneToMany
    private  List<Trajet> traj  = new ArrayList<>();


    public void setTraj(List<Trajet> traj) {
        this.traj = traj;
    }

    @ManyToOne
    private Users prop;

    @Override
    public String toString() {
        return "CamionsImpl{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dispo=" + dispo +
                '}';
    }

    public Camions( String nom, boolean dispo, String type) {
        this.nom = nom;
        this.dispo = dispo;
        this.type = type;
    }

    public Camions( Long id, String nom, boolean dispo, String type) {
        this.id = id;
        this.nom = nom;
        this.dispo = dispo;
        this.type = type;
    }

}
