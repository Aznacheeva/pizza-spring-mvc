package com.example.pizzasimple.pizza.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
import java.util.ArrayList;

public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Float cost;
    //private File picture;
    private ArrayList<Ingredient> possIngredients = new ArrayList<>();
    private ArrayList<Ingredient> addedIngredients;

    public Dish(Long id, String name, String description,
                Float cost, /*File picture,*/ ArrayList<Ingredient> possIngredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
        //this.picture = picture;
        this.possIngredients = possIngredients;
        addedIngredients = new ArrayList<>();
    }

    public Dish() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Float getCost() {
        return cost;
    }

    /*public File getPicture() {
        return picture;
    }*/

    public ArrayList<Ingredient> getPossIngredients() {
        return possIngredients;
    }

    public ArrayList<Ingredient> getAddedIngredients() {
        return addedIngredients;
    }
}
