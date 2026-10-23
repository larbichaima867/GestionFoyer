package tn.esprim.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.Etudiant;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
}
