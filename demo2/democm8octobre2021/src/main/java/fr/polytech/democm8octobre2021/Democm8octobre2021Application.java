package fr.polytech.democm8octobre2021;

import fr.polytech.democm8octobre2021.dao.Produit;
import fr.polytech.democm8octobre2021.dao.ProduitInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Democm8octobre2021Application {

    public static void main(String[] args) {
        SpringApplication.run(Democm8octobre2021Application.class, args);
    }
@Bean
    CommandLineRunner runner(ProduitInterface produitInterface){
        return args -> {
          produitInterface.save(new Produit(1,"Tablette",500));
          produitInterface.save(new Produit(2,"Switch",200));
          produitInterface.save(new Produit(3,"Routeur",1500));
          produitInterface.save(new Produit(4,"Ethernet",50));

          produitInterface.findAll().forEach(produit -> {
              System.out.println(produit.getDesignation());
          });
        };

    }
}
