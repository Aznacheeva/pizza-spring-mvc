package com.example.pizzasimple.pizza.service;

import com.example.pizzasimple.pizza.model.Client;
import com.example.pizzasimple.pizza.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Iterable<Client> listAllClients() {
        return clientRepository.findAll();
    }

    public void createClient(String name, String phone) {
        clientRepository.save(new Client(null, name, phone));
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
