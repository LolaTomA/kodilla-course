package com.kodilla.good.patterns.task134;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    Producer producer;
    Product product;

    Map<Producer, Product> productRepository = new HashMap<>();
    public void addProduct(){
        productRepository.put(producer, product);
    }

    public Product getProduct() {
        return productRepository.get(producer);
    }
}
