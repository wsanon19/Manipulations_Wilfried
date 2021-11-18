package bf.sagen.logis_bf.dao;


import bf.sagen.logis_bf.model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itrajet extends JpaRepository<Trajet, Long> {
}
