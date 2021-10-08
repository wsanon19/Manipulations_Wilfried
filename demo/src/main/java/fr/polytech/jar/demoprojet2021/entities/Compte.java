package fr.polytech.jar.demoprojet2021.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Annotation JPA
@Entity
public class Compte {
    @Id   //Definir comme cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Auto incrementation de la cle primaire
    private int id;
    private double solde;

    public Compte(int id, double solde) {
        this.id = id;
        this.solde = solde;
    }

    public Compte(double solde) {
        this.solde = solde;
    }

    public Compte() {

    }



}
