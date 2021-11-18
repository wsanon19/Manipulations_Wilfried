package bf.sagen.logis_bf.dao;


import bf.sagen.logis_bf.model.Camions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICamions extends JpaRepository<Camions, Long> {

    Camions findCamionsById(Long l);
}

// Pour utiliser une base de donne mysql il faut crer la base de donnes le nom doit etre celui mentionner dan sle fichier appplication properties et la table entity