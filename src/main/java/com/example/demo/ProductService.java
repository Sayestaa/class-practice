package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private int nextId = 1;

    // constructor: seeds one object of each subclass into the same list
    public ProductService() {
        products.add(new DigitalProduct(nextId++, "Clean Code (E-book)", 29.99,
                "/downloads/clean-code.pdf", 4.2));
        products.add(new PhysicalProduct(nextId++, "27-inch Monitor", 249.99,
                5.4, "61cm x 41cm x 18cm"));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName()
                        .contains(name))
                .toList();
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}