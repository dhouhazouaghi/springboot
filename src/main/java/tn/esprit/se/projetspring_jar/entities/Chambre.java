package tn.esprit.se.projetspring_jar.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private Long idChambre;
    private Long numeroChambre;

//enumtype.ordinal ne laisse pas les typee denumaration apparaitre en lettre :exp 0,1 pour securite
    @Enumerated(EnumType.STRING)
    private Typec typeChambre;
    @ManyToOne
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;


}