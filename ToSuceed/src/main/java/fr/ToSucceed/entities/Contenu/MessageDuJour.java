package fr.ToSucceed.entities.Contenu;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @NoArgsConstructor  @AllArgsConstructor  @Getter  @Setter
@Entity
public class MessageDuJour {

    @Id
    private int id;
    private String titre_msg;
    private String contenu_msg;



}
