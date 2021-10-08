package fr.polytech.democm8octobre2021.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitInterface extends JpaRepository<Produit, Integer> {  //J'ai des objets de la classe produits que je veux persister et la cle primaire est de type int
}
