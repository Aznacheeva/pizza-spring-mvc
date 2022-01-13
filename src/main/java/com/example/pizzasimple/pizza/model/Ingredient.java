package com.example.pizzasimple.pizza.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;

public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Float cost;
    /*private File picture;*/

    public Ingredient(Long id, String name, Float cost/*, File picture*/) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        /*this.picture = picture;*/
    }

    public Ingredient() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getCost() {
        return cost;
    }

    /*public File getPicture() {
        return picture;
    }*/
}
