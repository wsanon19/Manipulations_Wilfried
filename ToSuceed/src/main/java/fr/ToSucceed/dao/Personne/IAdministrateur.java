package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IAdministrateur extends JpaRepository<Administrateur,Integer> {
}
