package com.kodilla.good.patterns.task134;

public class Product {
    final String productName;
    int quantity;

    public Product(final String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return productName + " quantity " + quantity;
    }
}
