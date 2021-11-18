package bf.sagen.log_info.dao;

import bf.sagen.log_info.entities.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduits extends JpaRepository<Produits, Long> {
}
