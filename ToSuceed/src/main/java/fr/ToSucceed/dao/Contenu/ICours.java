package fr.ToSucceed.dao.Contenu;

import fr.ToSucceed.entities.Contenu.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICours extends JpaRepository<Cours,Integer> {
}
