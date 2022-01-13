package com.example.pizzasimple.pizza.repository;

import com.example.pizzasimple.pizza.model.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish, Long> {
}
