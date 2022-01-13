package com.example.pizzasimple.pizza.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ArrayList<Dish> dishes = new ArrayList<>();
    private Float totalCost;

    public Order(Long id, ArrayList<Dish> dishes, Float totalCost) {
        this.id = id;
        this.dishes = dishes;
        this.totalCost = totalCost;
    }

    public Order() {}

    public Long getId() {
        return id;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public Float getTotalCost() {
        return totalCost;
    }
}
