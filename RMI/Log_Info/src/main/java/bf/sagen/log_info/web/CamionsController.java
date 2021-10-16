package bf.sagen.log_info.web;

import bf.sagen.log_info.dao.CamionsImpl;
import bf.sagen.log_info.dao.ICamions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/Logistique")
public class CamionsController {
    @Autowired
    private ICamions iCamions;

    @Produces({MediaType.APPLICATION_JSON})
    @Path("/Camions")
    @GET
    public List<CamionsImpl> CamionsList(){
        return iCamions.findAll();
    }

    @Path("/Camions/{identifiant}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public CamionsImpl getCamion(@PathParam(value = "identifiant") int identifiant){
        return iCamions.findById(identifiant).get();
    }
}
