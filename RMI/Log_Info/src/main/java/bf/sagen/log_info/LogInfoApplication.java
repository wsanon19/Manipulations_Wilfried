package bf.sagen.log_info;

import bf.sagen.log_info.entities.CamionsImpl;
import bf.sagen.log_info.dao.ICamions;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LogInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogInfoApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(ICamions iCamions){

        return args -> {
            iCamions.save(new CamionsImpl("Tesla ",true,"Citerne"));
            iCamions.save(new CamionsImpl("Acura",true,"Benne"));
            iCamions.save(new CamionsImpl("Porshe",true,"Benne"));

            iCamions.findAll().forEach(camionsImpl -> {
                System.out.println(camionsImpl.toString());
            });
        };


    }



}
