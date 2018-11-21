package com.tymur.rest.controllers;

import com.tymur.rest.models.Client;

import com.tymur.rest.services.ClientService;
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
    private ClientService clientService;

    @GetMapping
    public Iterable<Client> getClients(@QuerydslPredicate(root = Client.class) Predicate predicate) {
        return clientService.getClients(predicate);
    }
}