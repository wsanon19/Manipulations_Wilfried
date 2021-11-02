package fr.ToSucceed.dao.Abonnement;

import fr.ToSucceed.entities.Abonnement.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IAbonnement extends JpaRepository<Abonnement,Integer> {

}
