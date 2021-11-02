package fr.ToSucceed.entities.Personne;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @NoArgsConstructor  @Getter @Setter
@Entity
public class Administrateur extends Personne {

    public String set_Contenu(String txt){
        return txt;
    }
}
