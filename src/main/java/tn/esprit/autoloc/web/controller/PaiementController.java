package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Paiement")
public class PaiementController {

    private final IPaiementService ip;

    @PostMapping("/addPaiement")
    public Paiement addPaiement(@RequestBody Paiement p) {
        return ip.addPaiement(p);
    }

    @GetMapping("/getPaiements")
    public List<Paiement> getAllPaiements() {
        return ip.retrieveAllPaiements();
    }

    @GetMapping("/getPaiementId/{idp}")
    public Paiement getPaiementById(@PathVariable Long idp) {
        return ip.retrievePaiement(idp);
    }

    @DeleteMapping("/deletePaiement/{idpp}")
    public void deletePaiement(@PathVariable Long idpp) {
        ip.removePaiement(idpp);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement p) {
        return ip.updatePaiement(p);
    }
}