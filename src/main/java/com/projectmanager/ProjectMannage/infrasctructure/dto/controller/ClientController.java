package com.projectmanager.ProjectMannage.infrasctructure.dto.controller;

import com.projectmanager.ProjectMannage.domain.entity.Client;
import com.projectmanager.ProjectMannage.applicationservice.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll() {
        return clientService.findAll();
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return clientService.save(client);
    }
}