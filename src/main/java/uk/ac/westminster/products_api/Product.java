package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    // 1. Required for Jackson deserialization (No-arg constructor)
    public Product() {}

    // 2. Parameterized constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // 3. Setters required for Tutorial 3
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}