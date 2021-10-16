package bf.sagen.log_info.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICamions extends JpaRepository<CamionsImpl, Integer> {
}

// Pour utiliser une base de donne mysql il faut crer la base de donnes le nom doit etre celui mentionner dan sle fichier appplication properties et la table entity