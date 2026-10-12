package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Maintenance")
public class MaintenanceController {

    private final IMaintenanceService im;

    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance m) {
        return im.addMaintenance(m);
    }

    @GetMapping("/getMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return im.retrieveAllMaintenances();
    }

    @GetMapping("/getMaintenanceId/{idm}")
    public Maintenance getMaintenanceById(@PathVariable Long idm) {
        return im.retrieveMaintenance(idm);
    }

    @DeleteMapping("/deleteMaintenance/{idmm}")
    public void deleteMaintenance(@PathVariable Long idmm) {
        im.removeMaintenance(idmm);
    }

    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance m) {
        return im.updateMaintenance(m);
    }
}