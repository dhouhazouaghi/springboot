package esprit.se.foyer.controller;

//import esprit.se.foyer.entities.Etudient;
//import esprit.se.foyer.services.IEtudiantServices;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    private static final Logger logger = LoggerFactory.getLogger(EtudiantController.class);
    IEtudiantServices etudiantServices;
    @GetMapping("/removealletudiants")
    public List<Etudient> getEtudiants() {
        return etudiantServices.removeAllEtudiants();
    }

    @PostMapping("/addetudiant")
    public Etudient addEtudiant(@RequestBody Etudient etudiant) {
        logger.debug("Adding student: {}", etudiant);
        Etudient addedEtudient = etudiantServices.addEtudiant(etudiant);
        logger.debug("Added student with ID: {}", addedEtudient.getIdEtudiant());
        return addedEtudient;
    }

    @PutMapping("/updateetudiant")
    public Etudient updateEtudiant(@RequestBody Etudient etudiant) {
        return etudiantServices.updateEtudiant(etudiant);
    }

    @GetMapping("/findetudiantbyid/{id}")
    public Etudient getEtudiant(@PathVariable Long id) {
        return etudiantServices.findEtudiantById(id);
    }

    @DeleteMapping("/removeetudiantbyid/{id}")
    public void removeEtudiantById(@PathVariable Long id) {
        etudiantServices.removeEtudiantById(id);
    }
}
