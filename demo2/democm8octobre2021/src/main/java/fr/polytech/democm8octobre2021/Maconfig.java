package fr.polytech.democm8octobre2021;

import fr.polytech.democm8octobre2021.web.ProduitController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Maconfig {  //dire de plus utiliser dispatcher mais utiliser la servlet jersey
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.register(ProduitController.class); // dans produit controlleur on utilise annotation jersey et donc permet de dire quon utilise servlet de jersy
        return resourceConfig;
    }
}
