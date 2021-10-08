package fr.polytech.jar.demoprojet2021.dao;

import fr.polytech.jar.demoprojet2021.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Compteinterface extends JpaRepository<Compte, Integer> {  //    Interface permettant d'interaghir avec les bases de donnee


}
