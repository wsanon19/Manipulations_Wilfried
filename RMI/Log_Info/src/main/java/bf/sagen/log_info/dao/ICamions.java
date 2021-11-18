package bf.sagen.log_info.dao;

import bf.sagen.log_info.entities.CamionsImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICamions extends JpaRepository<CamionsImpl, Long> {
    Optional<CamionsImpl> findCamionsImplById(Long l);
}

// Pour utiliser une base de donne mysql il faut crer la base de donnes le nom doit etre celui mentionner dan sle fichier appplication properties et la table entity