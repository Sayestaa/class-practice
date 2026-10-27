package com.example.demo;

public class Product {
    private static int instanceCount = 0;

    private int id;
    private String name;
    private int quantity;
    private boolean available;
    private double price;

    // no-arg constructor (needed by Jackson for POST requests)
    public Product() {
        instanceCount++;
    }

    // 3-argument constructor (used by the subclasses via super(...))
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        instanceCount++;
    }

    // your original full constructor
    public Product(int id, String name, int quantity, boolean available, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.available = available;
        this.price = price;
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", available=" + available +
                ", price=" + price + '}';
    }
}