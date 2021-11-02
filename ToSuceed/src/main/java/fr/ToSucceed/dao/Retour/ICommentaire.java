package fr.ToSucceed.dao.Retour;

import fr.ToSucceed.entities.Retour.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICommentaire extends JpaRepository<Commentaire,Integer> {
}
