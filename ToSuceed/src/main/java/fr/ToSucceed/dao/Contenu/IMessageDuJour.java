package fr.ToSucceed.dao.Contenu;

import fr.ToSucceed.entities.Contenu.MessageDuJour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IMessageDuJour extends JpaRepository<MessageDuJour,Integer> {
}
