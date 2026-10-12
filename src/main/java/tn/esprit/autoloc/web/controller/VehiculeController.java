package tn.esprit.autoloc.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Vehicule")
public class VehiculeController {

    private final IVehiculeService iv;

    @Operation(summary = "Ajouter un véhicule")
    @ApiResponse(responseCode = "200", description = "Véhicule créé")
    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return iv.addVehicule(v);
    }

    @Operation(summary = "Lister tous les véhicules")
    @ApiResponse(responseCode = "200", description = "Liste des véhicules")
    @GetMapping("/getVehicules")
    public List<Vehicule> getAllVehicules() {
        return iv.retrieveAllVehicules();
    }

    @Operation(summary = "Récupérer un véhicule par id")
    @ApiResponse(responseCode = "200", description = "Véhicule trouvé")
    @GetMapping("/getVehiculeId/{idv}")
    public Vehicule getVehiculeById(@PathVariable Long idv) {
        return iv.retrieveVehicule(idv);
    }

    @Operation(summary = "Supprimer un véhicule")
    @ApiResponse(responseCode = "200", description = "Véhicule supprimé")
    @DeleteMapping("/deleteVehicule/{idvv}")
    public void deleteVehicule(@PathVariable Long idvv) {
        iv.removeVehicule(idvv);
    }

    @Operation(summary = "Modifier un véhicule")
    @ApiResponse(responseCode = "200", description = "Véhicule modifié")
    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule v) {
        return iv.updateVehicule(v);
    }
}