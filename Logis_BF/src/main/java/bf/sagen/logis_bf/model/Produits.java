package bf.sagen.logis_bf.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Produits {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id_prod;
    private String nom;
    private double prix_kilo;

    @OneToMany (mappedBy = "prod")
    private List<Camions> camions  = new ArrayList<>();;
}
