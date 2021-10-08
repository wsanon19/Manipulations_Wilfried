package fr.polytech.jar.demoprojet2021;

import fr.polytech.jar.demoprojet2021.dao.Compteinterface;
import fr.polytech.jar.demoprojet2021.entities.Compte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean  // Permet l'execution du main
    CommandLineRunner start(Compteinterface compteinterface){  //
        return args -> {
            compteinterface.save(new Compte(1200));
            compteinterface.save(new Compte(2800));
            compteinterface.save(new Compte(3700));



        };
    }

}
