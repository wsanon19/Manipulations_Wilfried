package fr.ToSucceed;


import fr.ToSucceed.dao.Abonnement.IAbonnement;
import fr.ToSucceed.dao.Contenu.ICours;
import fr.ToSucceed.dao.Contenu.IMessageDuJour;
import fr.ToSucceed.dao.Personne.IAdministrateur;
import fr.ToSucceed.dao.Personne.IEleve;
import fr.ToSucceed.dao.Personne.IPersonne;
import fr.ToSucceed.dao.Personne.IProfesseur;
import fr.ToSucceed.dao.Retour.ICommentaire;
import fr.ToSucceed.entities.Abonnement.Abonnement;
import fr.ToSucceed.entities.Contenu.Cours;
import fr.ToSucceed.entities.Contenu.MessageDuJour;
import fr.ToSucceed.entities.Personne.Administrateur;
import fr.ToSucceed.entities.Personne.Eleve;
import fr.ToSucceed.entities.Personne.Personne;
import fr.ToSucceed.entities.Personne.Professeur;
import fr.ToSucceed.entities.Retour.Commentaire;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class ToSuceedApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToSuceedApplication.class, args);
    }

   @Bean
    CommandLineRunner runner(IAbonnement iAbonnement,
                             ICommentaire iCommentaire ,
                             IAdministrateur iAdministrateur,
                             IEleve iEleve,
                             IPersonne iPersonne,
                             IProfesseur iProfesseur,
                             ICours iCours,
                             IMessageDuJour iMessageDuJour){
        return args -> {
           Abonnement abo  = new Abonnement();
           abo.setId(2);
           abo.setPrix(5000);

           Commentaire com = new Commentaire();
           com.setId(2);
           com.setContenu_msg("Ca avance");

           Administrateur admin = new Administrateur();
           admin.setId(4);
           admin.setNom_utilisateur("wsanon19");
           admin.setAccess_pl(true);


           Eleve eleve = new Eleve();
           eleve.setId(5);
           eleve.setAccess_pl(true);
           eleve.setNom_utilisateur("wsanon20");



           Professeur prof = new Professeur();
           prof.setId(6);
           prof.setNom_utilisateur("wsanon21");
           prof.setAccess_pl(true);

           Cours math = new Cours();
           math.setId(2);

            MessageDuJour mess = new MessageDuJour();
            mess.setId(2);
            mess.setContenu_msg("La vie cest un jeu");

            iAbonnement.save(abo);
            iCommentaire.save(com);
            iAdministrateur.save(admin);
            iCours.save(math);
            iEleve.save(eleve);
            iMessageDuJour.save(mess);
            iProfesseur.save(prof);

        };
    }

}
