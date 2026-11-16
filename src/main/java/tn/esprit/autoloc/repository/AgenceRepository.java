package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface AgenceRepository extends JpaRepository<Agence, Long> {

    // Q4 : agences d'une ville
    List<Agence> findByVille(String ville);
}