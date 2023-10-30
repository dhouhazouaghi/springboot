package tn.esprit.se.projetspring_jar.services;

import tn.esprit.se.projetspring_jar.entities.Etudiant;
import tn.esprit.se.projetspring_jar.repositories.EtudiantRepository;

import java.util.List;

public class Etudiantservice implements IEtudiantService {
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return   etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return   etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();

    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        return  etudiantRepository.deleteById(idEtudiant)
    }
}
