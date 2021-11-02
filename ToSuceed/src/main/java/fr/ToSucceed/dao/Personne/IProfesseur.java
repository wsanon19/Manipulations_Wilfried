package fr.ToSucceed.dao.Personne;

import fr.ToSucceed.entities.Personne.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IProfesseur extends JpaRepository<Professeur,Integer> {
}
