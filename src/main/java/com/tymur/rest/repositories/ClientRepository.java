package com.tymur.rest.repositories;

import com.tymur.rest.models.Client;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long>, QuerydslPredicateExecutor<Client> {
}
