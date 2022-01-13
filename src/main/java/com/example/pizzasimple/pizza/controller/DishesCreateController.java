package com.example.pizzasimple.pizza.controller;

import com.example.pizzasimple.pizza.model.Ingredient;
import com.example.pizzasimple.pizza.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class DishesCreateController {
    @Autowired
    DishService dishService;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String getCreate(Model model) {
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("name") String name,
                           @ModelAttribute("description") String description,
                           @ModelAttribute("cost") Float cost,
                           @ModelAttribute("possIngredient") ArrayList<Ingredient> possIngredient) {
        dishService.createDish(name, description, cost, possIngredient);
        return "redirect:/";
    }
}
