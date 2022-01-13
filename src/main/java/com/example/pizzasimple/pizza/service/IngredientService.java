package com.example.pizzasimple.pizza.service;

import com.example.pizzasimple.pizza.model.Ingredient;
import com.example.pizzasimple.pizza.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
    @Autowired
    IngredientRepository ingredientRepository;

    public Iterable<Ingredient> findAllIngredient() { return ingredientRepository.findAll(); }

    public void createIngredient(String name, Float cost) {
        ingredientRepository.save(new Ingredient(null, name, cost));
    }

    public void deleteIngredientById(Long id) {
        ingredientRepository.deleteById(id);
    }
}
