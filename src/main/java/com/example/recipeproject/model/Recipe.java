package com.example.recipeproject.model;

import com.example.recipeproject.model.Ingredient;

import java.util.List;

public class Recipe extends BaseEntity{

    private Long id;
    private final List<Ingredient> ingredients;
    private String instructions;

    public Recipe(Long id, List<Ingredient> ingredients, String instructions) {
        this.id = id;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Recipe(List<Ingredient> ingredients, String instructions) {
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
