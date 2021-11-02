package fr.ToSucceed.entities.Abonnement;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data  @NoArgsConstructor  @AllArgsConstructor  @Getter  @Setter
@Entity
public class Abonnement {

    @Id
    private int id;
    private double prix;
    private int duree;



}
