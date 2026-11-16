package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.CategorieVehicule;
import tn.esprit.autoloc.domain.StatutVehicule;
import tn.esprit.autoloc.domain.Vehicule;

import java.math.BigDecimal;
import java.util.List;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

    // Q1 : marque exacte
    List<Vehicule> findByMarque(String marque);

    // Q2 : catégorie donnée
    List<Vehicule> findByCategorie(CategorieVehicule categorie);

    // Q3 : statut (le service passera DISPONIBLE)
    List<Vehicule> findByStatut(StatutVehicule statut);

    // Q5 : la marque contient une chaîne (LIKE %chaine%)
    List<Vehicule> findByMarqueContaining(String chaine);

    // Q8 : tarif strictement supérieur à une valeur
    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);

    // Q11 : marque ET statut
    List<Vehicule> findByMarqueAndStatut(String marque, StatutVehicule statut);
}