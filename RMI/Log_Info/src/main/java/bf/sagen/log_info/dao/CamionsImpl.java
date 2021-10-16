package bf.sagen.log_info.dao;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CamionsImpl {

    @Id
    private int id;
    private String nom;
    private boolean dispo;


    public CamionsImpl() {
    }

    public CamionsImpl(int id, String nom, boolean dispo) {
        this.id = id;
        this.nom = nom;
        this.dispo = dispo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    @Override
    public String toString() {
        return "CamionsImpl{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dispo=" + dispo +
                '}';
    }


}
