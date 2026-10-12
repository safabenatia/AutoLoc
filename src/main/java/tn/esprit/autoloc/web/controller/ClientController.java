package tn.esprit.autoloc.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Client")
public class ClientController {

    private final IClientService ic;

    @Operation(summary = "Ajouter un client")
    @ApiResponse(responseCode = "200", description = "Client créé")
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c) {
        return ic.addClient(c);
    }

    @Operation(summary = "Lister tous les clients")
    @ApiResponse(responseCode = "200", description = "Liste des clients")
    @GetMapping("/getClients")
    public List<Client> getAllClients() {
        return ic.retrieveAllClients();
    }

    @Operation(summary = "Récupérer un client par id")
    @ApiResponse(responseCode = "200", description = "Client trouvé")
    @GetMapping("/getClientId/{idc}")
    public Client getClientById(@PathVariable Long idc) {
        return ic.retrieveClient(idc);
    }

    @Operation(summary = "Supprimer un client")
    @ApiResponse(responseCode = "200", description = "Client supprimé")
    @DeleteMapping("/deleteClient/{idcc}")
    public void deleteClient(@PathVariable Long idcc) {
        ic.removeClient(idcc);
    }

    @Operation(summary = "Modifier un client")
    @ApiResponse(responseCode = "200", description = "Client modifié")
    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client c) {
        return ic.updateClient(c);
    }
}