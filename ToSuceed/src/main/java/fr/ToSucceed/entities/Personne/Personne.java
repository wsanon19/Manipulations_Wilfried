package fr.ToSucceed.entities.Personne;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Personne {

    @Id
    private int id;
    private String nom_utilisateur;
    private String mot_de_passe;
    private String nom;
    private String prenom;
    private Date dob;
    private String mail;
    private Date doi;
    private boolean access_pl;

}
