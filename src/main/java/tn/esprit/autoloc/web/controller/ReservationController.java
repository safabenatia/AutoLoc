package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {

    private final IReservationService ir;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return ir.addReservation(r);
    }

    @GetMapping("/getReservations")
    public List<Reservation> getAllReservations() {
        return ir.retrieveAllReservations();
    }

    @GetMapping("/getReservationId/{idr}")
    public Reservation getReservationById(@PathVariable Long idr) {
        return ir.retrieveReservation(idr);
    }

    @DeleteMapping("/deleteReservation/{idrr}")
    public void deleteReservation(@PathVariable Long idrr) {
        ir.removeReservation(idrr);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        return ir.updateReservation(r);
    }
}