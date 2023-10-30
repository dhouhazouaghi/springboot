package tn.esprit.se.projetspring_jar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.projetspring_jar.entities.Reservation;


public interface ReservationRepository extends JpaRepository <Reservation,String> {
}
