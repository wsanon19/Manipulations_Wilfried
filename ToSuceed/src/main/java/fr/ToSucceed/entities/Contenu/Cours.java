package fr.ToSucceed.entities.Contenu;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
@Entity
public class Cours {
    @Id
    private int id;
    private String niveau;
    private String nom;
    private String description;
    private Date dop;
    private String matiere;
    @Enumerated(EnumType.STRING)
    private CoursType type;


}
