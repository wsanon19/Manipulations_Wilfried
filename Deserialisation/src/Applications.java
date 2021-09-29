import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Applications {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Personne.class);
        Unmarshaller um = jc.createUnmarshaller();
        Personne p = (Personne)um.unmarshal(new File("resultat.xml"));
        System.out.println("Nom :" + p.getNom() +" Prenom :" + p.getPrenom() + " Année de Naissance :" + p.getDateNaissance().getAnnee());

    }

}
