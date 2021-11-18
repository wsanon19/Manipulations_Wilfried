package bf.sagen.log_info.dao;

import bf.sagen.log_info.entities.Produits;
import bf.sagen.log_info.entities.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itrajet extends JpaRepository<Trajet, Long> {
}
