package com.example.pizzasimple.pizza.service;

import com.example.pizzasimple.pizza.model.Dish;
import com.example.pizzasimple.pizza.model.Ingredient;
import com.example.pizzasimple.pizza.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DishService {
    @Autowired
    DishRepository dishRepository;

    public Iterable<Dish> listAllDishes() {
        return dishRepository.findAll();
    }

    public void createDish(String name, String description,
                           Float cost, ArrayList<Ingredient> possIngredient) {
        dishRepository.save(new Dish(null, name, description, cost, possIngredient));
    }

    public void deleteDishById(Long id) {
        dishRepository.deleteById(id);
    }

    /*public void deleteDishByName(String name) {

    }*/
}
