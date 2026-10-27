package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> allProducts() {   // renamed to avoid clash
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return productService.getProductById(id)
                .orElse(null); // Lecture 6
    }

    @PostMapping("/")
    public Product add(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/all")
    public Map<String, Object> allSummary() {   // renamed to avoid clash
        List<Product> productList = new ArrayList<>();
        int id = 123;
        for (int index = 0; index <= 4; index++) {
            id += index;
            productList.add(new Product(
                    id + index,
                    "Product-" + id,
                    20,
                    id % 2 == 0,
                    199.99
            ));
        }

        return Map.of(
                "Total Instance Count", Product.getInstanceCount(),
                "Total Products", productList
        );
    }
}