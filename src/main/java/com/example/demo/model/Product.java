package com.example.demo.model;

import java.util.List;

public class Product {

    private Long id;
    private String name;
    private String category;
    private String imageMain;
    private String imageHover;
    private int price;              // 👈 precio en entero
    private String description;
    private String fit;
    private List<String> sizes;     // 👈 tallas disponibles
    private int stock;

    // Constructor con tallas en lista
    public Product(Long id,
                   String name,
                   String category,
                   String imageMain,
                   String imageHover,
                   int price,
                   String description,
                   String fit,
                   List<String> sizes,
                   int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.imageMain = imageMain;
        this.imageHover = imageHover;
        this.price = price;
        this.description = description;
        this.fit = fit;
        this.sizes = sizes;
        this.stock = stock;
    }

    // ===== GETTERS =====
    public Long getId() { return id; }

    public String getName() { return name; }

    public String getCategory() { return category; }

    public String getImageMain() { return imageMain; }

    public String getImageHover() { return imageHover; }

    public int getPrice() {        // 👈 ESTE ES EL QUE NECESITA EL CONTROLADOR
        return price;
    }

    public String getDescription() { return description; }

    public String getFit() { return fit; }

    public List<String> getSizes() { return sizes; }

    public int getStock() { return stock; }

    // (Setters opcionales si los necesitas)
}
