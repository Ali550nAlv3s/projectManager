package com.projectmanager.ProjectMannage.applicationservice;

import com.projectmanager.ProjectMannage.domain.entity.Client;
import com.projectmanager.ProjectMannage.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }
}