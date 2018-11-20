package com.tymur.rest.rest.controllers;

import com.tymur.rest.rest.models.Client;
import com.tymur.rest.rest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.querydsl.core.types.Predicate;

@RestController
@RequestMapping("/db")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public Iterable<Client> findCustomers(@QuerydslPredicate(root = Client.class) Predicate predicate) {
        return clientRepository.findAll(predicate);
    }
}