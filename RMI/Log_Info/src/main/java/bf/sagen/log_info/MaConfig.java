package bf.sagen.log_info;

import bf.sagen.log_info.web.CamionsController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.register(CamionsController.class);
        return resourceConfig;
    }
}
