package com.example.demo.model;

// Representa una categoría de productos (CAMISETAS, HOODIES, etc.)
public class Category {

    private Long id;
    private String name;
    private String imageUrl;

    // Constructor: sirve para crear objetos Category con todos sus datos
    public Category(Long id, String name, String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    // Getters: métodos para leer los valores de los atributos
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
