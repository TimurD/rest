package com.tymur.rest.services;

import com.querydsl.core.types.Predicate;
import com.tymur.rest.models.Client;
import com.tymur.rest.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Iterable<Client> getClients(Predicate predicate) {
        return clientRepository.findAll(predicate);
    }
}
