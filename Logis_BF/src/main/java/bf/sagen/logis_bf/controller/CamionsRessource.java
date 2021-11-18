package bf.sagen.logis_bf.controller;

import bf.sagen.logis_bf.dao.ICamions;
import bf.sagen.logis_bf.model.Camions;
import bf.sagen.logis_bf.model.Response;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.lang.Boolean.TRUE;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/logistique")
@RequiredArgsConstructor
public class CamionsRessource {

    @Autowired
    private final ICamions iCamions;

    @GetMapping("/Camions")
    public List<Camions> CamionsList(){
        return iCamions.findAll();
    }


    @GetMapping("/Camions/{identifiant}")
    public Camions getCamion(@PathVariable("identifiant")Long id) {
        return iCamions.findCamionsById(id);
    }

    @PostMapping(path = "/save")
    public void addNewCamion(@RequestBody Camions camion){
        iCamions.save(camion);
    }

    @DeleteMapping("/delete/{identifiant}")
    public Boolean deleteCamion(@PathVariable("identifiant") Long CamionsID){
        boolean exists = iCamions.existsById(CamionsID);
        if(!exists){
            throw new IllegalStateException("Camions with id "+CamionsID+" does not exist");
        }
        iCamions.deleteById(CamionsID);
        return  TRUE;
    }

//    @DeleteMapping("/list/{identifiant}")
//    public void delete(@PathVariable Long identifiant){
//        iCamions.deleteById(identifiant);
//    }



    @GetMapping("/list")
    public ResponseEntity<Response> getCamions(){
        Map<String, List<Camions>> myMap1 = new HashMap<String, List<Camions>>() {{
            put("camions", iCamions.findAll());
        }};
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(myMap1)
                        .message("Camions retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }



    @GetMapping("/list/{identifiant}")
    public ResponseEntity<Response> getCamionid(@PathVariable("identifiant") Long id){

        Map<String, Camions> myMap2 = new HashMap<String, Camions>() {{
            put("camions", iCamions.findCamionsById(id) );
        }};

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(myMap2)
                        .message("Camions retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
}
