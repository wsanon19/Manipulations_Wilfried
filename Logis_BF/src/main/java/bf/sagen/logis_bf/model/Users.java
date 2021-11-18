package bf.sagen.logis_bf.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Users {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id_user;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String mail;
    @Enumerated(EnumType.STRING)
    private User_Type role;

    @OneToMany (mappedBy = "prop")
    private List<Camions> camions  = new ArrayList<>();;

    @OneToMany (mappedBy = "client")
    private List<Courses> courses  = new ArrayList<>();;








}
