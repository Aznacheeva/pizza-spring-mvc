package com.example.pizzasimple.pizza.controller;

import com.example.pizzasimple.pizza.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DishesViewController {
    @Autowired
    DishService dishService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("appName", "Меню пиццерии");
        model.addAttribute("dishes", dishService.listAllDishes());
        return "menu";
    }
}
