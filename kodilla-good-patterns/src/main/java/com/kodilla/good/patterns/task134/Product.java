package com.kodilla.good.patterns.task134;

public class Product {
    private final Producer producer;
    private final String productName;
    private final int quantity;

    public Product(Producer producer, String productName, int quantity) {
        this.producer = producer;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Producer getProducer() {
        return producer;
    }
}
