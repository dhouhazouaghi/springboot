package tn.esprit.se.projetspring_jar.entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
    @Table( name = "Etudiant")
    public class Etudiant implements Serializable {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY) //.TABLE ou AUTO
        @Column(name="idEtudiant")
        private Long idEtudiant; // Clé primaire
        //@column(name=)
        private String nomEt;
        private String prenomEt;
        private Long cin;
        private String ecole;
        @Temporal(TemporalType.DATE)
        //localdate
        private Date dateNaissance;
        //@Transient
    //private long difference;//une variable pour stocker sans apparaitre dans bd

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
    }

