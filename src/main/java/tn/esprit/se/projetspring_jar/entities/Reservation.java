package tn.esprit.se.projetspring_jar.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Reservation")


public class Reservation implements Serializable {

    @Id

    @Column(name="idReservation")
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private Boolean estvalide ;
    @ManyToMany(mappedBy="reservations", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;


}
