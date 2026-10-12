package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Equipement")
public class EquipementController {

    private final IEquipementService ie;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement e) {
        return ie.addEquipement(e);
    }

    @GetMapping("/getEquipements")
    public List<Equipement> getAllEquipements() {
        return ie.retrieveAllEquipements();
    }

    @GetMapping("/getEquipementId/{ide}")
    public Equipement getEquipementById(@PathVariable Long ide) {
        return ie.retrieveEquipement(ide);
    }

    @DeleteMapping("/deleteEquipement/{idee}")
    public void deleteEquipement(@PathVariable Long idee) {
        ie.removeEquipement(idee);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement e) {
        return ie.updateEquipement(e);
    }
}