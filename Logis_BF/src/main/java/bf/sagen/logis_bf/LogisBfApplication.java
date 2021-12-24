package bf.sagen.logis_bf;

import bf.sagen.logis_bf.dao.ICamions;
import bf.sagen.logis_bf.dao.ICourses;
import bf.sagen.logis_bf.dao.Itrajet;
import bf.sagen.logis_bf.model.Camions;
import bf.sagen.logis_bf.model.Courses;
import bf.sagen.logis_bf.model.Trajet;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LogisBfApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisBfApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ICamions iCamions, ICourses iCourses, Itrajet itrajet){

        return args -> {
            Courses c1 = new Courses(2000,50);
            Courses c2 = new Courses(5000,300);
            Courses c3 = new Courses(6000,250);
            Courses c4 = new Courses(7000,700);

            Camions t1 = new Camions( "Ferrari", true, "Citerne");
            Camions t2 = new Camions( "Acura", false, "Benne");
            Trajet a = new Trajet();
            Trajet b = new Trajet();

            List<Trajet> x = new ArrayList<>();
            x.add(a);
            x.add(b);



            t1.setTraj(x);




            t1.setCourses(c1);
            t1.setCourses(c2);
            t1.setCourses(c3);
            t2.setCourses(c4);


            itrajet.save(a);
            itrajet.save(b);

            iCourses.save(c1);
            iCourses.save(c2);
            iCourses.save(c3);
            iCourses.save(c4);


            iCamions.save(t1);
            iCamions.save(t2);



            iCamions.save(new Camions("Toyota ",true,"Benne"));
            iCamions.save(new Camions("Lyon",true,"Citerne"));
            iCamions.save(new Camions("Porshe",true,"Benne"));

            iCamions.findAll().forEach(camionsImpl -> {
                System.out.println(camionsImpl.toString());
            });
        };
    }



    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-AlLow-Origin", "Content-Type",
                "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "Filename"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}
