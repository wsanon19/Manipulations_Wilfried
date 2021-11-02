package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IPersonne extends JpaRepository<Personne,Integer> {
}
