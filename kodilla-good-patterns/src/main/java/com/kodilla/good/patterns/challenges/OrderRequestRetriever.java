package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("John","Smith");

        LocalDateTime  orderDate = LocalDateTime.of(2020, 2, 14, 12, 15);

        String product = "Buty";
        System.out.println(user.toString() + " ordered: " + product);

     return new OrderRequest(user, orderDate, product);
    }

}
