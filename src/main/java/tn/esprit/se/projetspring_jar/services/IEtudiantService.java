package tn.esprit.se.projetspring_jar.services;
import tn.esprit.se.projetspring_jar.entities.Etudiant;
import java.util.List;

public interface IEtudiantService {


    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
}
