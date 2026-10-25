package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // (a) Empty no-arg constructor required by Jackson
    public PhysicalProduct() {}

    // (b) Full constructor taking inherited and new fields
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price); // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // (c) Getters for physical-specific fields
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}