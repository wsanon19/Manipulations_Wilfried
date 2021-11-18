package bf.sagen.logis_bf.dao;

import bf.sagen.logis_bf.model.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduits extends JpaRepository<Produits, Long> {
}
