package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Employe")
public class EmployeController {

    private final IEmployeService iem;

    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody Employe e) {
        return iem.addEmploye(e);
    }

    @GetMapping("/getEmployes")
    public List<Employe> getAllEmployes() {
        return iem.retrieveAllEmployes();
    }

    @GetMapping("/getEmployeId/{ide}")
    public Employe getEmployeById(@PathVariable Long ide) {
        return iem.retrieveEmploye(ide);
    }

    @DeleteMapping("/deleteEmploye/{idee}")
    public void deleteEmploye(@PathVariable Long idee) {
        iem.removeEmploye(idee);
    }

    @PutMapping("/updateEmploye")
    public Employe updateEmploye(@RequestBody Employe e) {
        return iem.updateEmploye(e);
    }
}