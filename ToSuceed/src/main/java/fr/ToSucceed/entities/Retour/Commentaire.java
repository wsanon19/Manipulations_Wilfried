package fr.ToSucceed.entities.Retour;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter
@Entity
public class Commentaire {

    @Id
    private int id;
    private Date date_com;
    private String contenu_msg;

}
