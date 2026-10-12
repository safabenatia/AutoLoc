package tn.esprit.autoloc.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Agence")
public class AgenceController {

    private final IAgenceService ia;

    @Operation(summary = "Ajouter une agence")
    @ApiResponse(responseCode = "200", description = "Agence créée")
    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence a) {
        return ia.addAgence(a);
    }

    @Operation(summary = "Lister toutes les agences")
    @ApiResponse(responseCode = "200", description = "Liste des agences")
    @GetMapping("/getAgences")
    public List<Agence> getAllAgences() {
        return ia.retrieveAllAgences();
    }

    @Operation(summary = "Récupérer une agence par id")
    @ApiResponse(responseCode = "200", description = "Agence trouvée")
    @GetMapping("/getAgenceId/{ida}")
    public Agence getAgenceById(@PathVariable Long ida) {
        return ia.retrieveAgence(ida);
    }

    @Operation(summary = "Supprimer une agence")
    @ApiResponse(responseCode = "200", description = "Agence supprimée")
    @DeleteMapping("/deleteAgence/{idaa}")
    public void deleteAgence(@PathVariable Long idaa) {
        ia.removeAgence(idaa);
    }

    @Operation(summary = "Modifier une agence")
    @ApiResponse(responseCode = "200", description = "Agence modifiée")
    @PutMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence a) {
        return ia.updateAgence(a);
    }
}