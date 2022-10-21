package com.example.recipeproject.model;

public class Ingredient extends BaseEntity{
    private Long id;
    private String name;
    private String country_of_origin;
    private String seasoning;

    public Ingredient(Long id, String name, String country_of_origin, String seasoning) {
        this.id = id;
        this.name = name;
        this.country_of_origin = country_of_origin;
        this.seasoning = seasoning;
    }

    public Ingredient(String name, String country_of_origin, String seasoning) {
        this.name = name;
        this.country_of_origin = country_of_origin;
        this.seasoning = seasoning;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public String getSeasoning() {
        return seasoning;
    }

    public void setSeasoning(String seasoning) {
        this.seasoning = seasoning;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", details='" + name + '\'' +
                ", country_of_origin='" + country_of_origin + '\'' +
                ", seasoning='" + seasoning + '\'' +
                '}';
    }
}
