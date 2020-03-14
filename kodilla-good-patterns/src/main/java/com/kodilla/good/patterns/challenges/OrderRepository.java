package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private final List<OrderRequest> ordersHistoryList = new ArrayList<>();

    public OrderRequest createOrder() {

        User user = new User("John", "Smith");
        LocalDateTime orderDate = LocalDateTime.of( 2020, 2, 14, 12,15);
        String product = "Shoes";

        OrderRequest orderRequest = new OrderRequest(user, orderDate, product);
        ordersHistoryList.add(orderRequest);

        return orderRequest;
     }

    public List<OrderRequest> getOrdersHistoryList() {
        return new ArrayList<>(ordersHistoryList);
    }
}
