package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IEleve extends JpaRepository<Eleve,Integer> {
}
