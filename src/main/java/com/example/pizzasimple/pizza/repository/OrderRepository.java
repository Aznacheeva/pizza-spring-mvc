package com.example.pizzasimple.pizza.repository;

import com.example.pizzasimple.pizza.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
