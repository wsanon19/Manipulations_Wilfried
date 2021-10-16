package fr.polytech.democm8octobre2021.web;

import fr.polytech.democm8octobre2021.dao.Produit;
import fr.polytech.democm8octobre2021.dao.ProduitInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
//L'ensemble des annotations sont ceux de jersey
//l'API rest est percu comme un repertoire contenant dans le localhost:8181/
// un repertoires commerce
//un repertoire produits

@Component //demander de scanner la classe
@Path("/commerce")
public class ProduitController {
    //Injection de dependances et inversion de controle
@Autowired // pour faire injection des depandnaces
    private ProduitInterface produitInterface;

    @Path("/produits")
    @GET  // le verbe
    //la methode est la ressource
    @Produces({MediaType.APPLICATION_JSON})  //par defaut renvoi du texte ici on dit denvoyer un fichier de type json
    public List<Produit> produitList(){
        return produitInterface.findAll();
    }

    //la classe optionnellle pour tout ce qui est generecite en java 8
    @Path("/produits/{identifiant}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Produit getProduit(@PathParam(value = "identifiant") int identifiant){
        return produitInterface.findById(identifiant).get();
    }

    @Path("/produits")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Produit save(Produit produit){ // Quand on utilise Post pour ajputer un elemeent dan la BD on la renvoie
        return produitInterface.save(produit);
    }

    @Path("/produits/{identifiant}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Produit Updateproduit(Produit produit,@PathParam(value="identifiant") int identifiant){
        produit.setIdentifiant(identifiant);
        return produitInterface.save(produit);      // Surement va falloir modifier soit coté POST soit cote PUT
    }


    @Path("/produits/{identifiant}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public String deleteProduit (@PathParam(value="identifiant") int identifiant){
        Produit pr =  produitInterface.findById(identifiant).get();
        produitInterface.delete(pr);
        return pr.getDesignation() + " a bien été supprimé";
    }




}
