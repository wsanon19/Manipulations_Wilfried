package bf.sagen.log_info.entities;

import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class CamionsImpl {

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

    @OneToMany (mappedBy = "camions")
    private List<Courses> courses = new ArrayList<>();

    @OneToMany
    private  List<Trajet> traj  = new ArrayList<>();

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

    public CamionsImpl( String nom, boolean dispo, String type) {
        this.nom = nom;
        this.dispo = dispo;
        this.type = type;
    }
}
