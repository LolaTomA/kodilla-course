package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderDate;
    private String product;

    public OrderRequest(final User user, final LocalDateTime orderDate, final String product) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getProduct() {
        return product;
    }
}

