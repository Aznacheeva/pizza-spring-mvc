package com.example.pizzasimple.pizza.repository;

import com.example.pizzasimple.pizza.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
