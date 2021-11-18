package bf.sagen.logis_bf;

import bf.sagen.logis_bf.dao.ICamions;
import bf.sagen.logis_bf.model.Camions;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LogisBfApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisBfApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ICamions iCamions){

        return args -> {
            iCamions.save(new Camions(30L,"Toyota ",true,"Benne"));
//            iCamions.save(new Camions("Lyon",true,"Citerne"));
//            iCamions.save(new Camions("Porshe",true,"Benne"));

            iCamions.findAll().forEach(camionsImpl -> {
                System.out.println(camionsImpl.toString());
            });
        };


    }
}
