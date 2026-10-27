package com.example.demo;

// A PhysicalProduct IS-A Product because it is a kind of product that is sold, with an id, name and price.
// A ShoppingCart would NOT pass this test: a cart HAS products, it is not a product (HAS-A, so use a field).
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(int id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}