package bf.sagen.log_info.web;

import bf.sagen.log_info.entities.CamionsImpl;
import bf.sagen.log_info.dao.ICamions;
import bf.sagen.log_info.entities.Response;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.sun.javafx.collections.MappingChange;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
import lombok.RequiredArgsConstructor;
import org.glassfish.jersey.internal.util.collection.ImmutableMultivaluedMap;
import org.hibernate.metamodel.model.domain.MappedSuperclassDomainType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


import java.util.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/camion")
@RequiredArgsConstructor
public class CamionsController {
    @Autowired
    private final ICamions iCamions;

    @GetMapping
    public List<CamionsImpl> CamionsList(){
        return iCamions.findAll();
    }


    @GetMapping("/Camions/{identifiant}")
    public CamionsImpl getCamion(@PathVariable("identifiant")Long id) {
        return iCamions.findCamionsImplById(id).get();
    }

    @PostMapping
    public void addNewCamion(@RequestBody CamionsImpl camion){
        Optional<CamionsImpl> camionOptional = iCamions.findCamionsImplById(camion.getId());
        if (camionOptional.isPresent()){
            throw new IllegalStateException("ID taken");
        }
        iCamions.save(camion);
    }

    @DeleteMapping("delete/{id}")
    public void deleteCamion(@PathVariable("id")Long CamionsID){
        boolean exists = iCamions.existsById(CamionsID);
        if(!exists){
            throw new IllegalStateException("Camions with id "+CamionsID+" does not exist");
        }
        iCamions.deleteById(CamionsID);
    }
//    static final Map<?, ?> MY_MAP = new ImmutableMultivaluedMap<>();
//
//
//    public ResponseEntity<Response> getCamions(){
//        return ResponseEntity.ok(
//                Response.builder()
//                        .timeStamp(LocalDateTime.now())
//                        .data(Map.ofEntries)
//                        .message("Camions retrieved")
//                        .status(OK)
//                        .statusCode(OK.value())
//                        .build()
//         );
//    }
}
