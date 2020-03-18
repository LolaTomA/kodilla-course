package com.kodilla.good.patterns.task134;

public class Product {
     final String productName;
     final int quantity;

    public Product( String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
