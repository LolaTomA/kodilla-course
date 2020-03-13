package com.kodilla.good.patterns.challenges;

public class InformationService {

    public void inform(User user) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        System.out.println("Dear " + user.toString() + ", your order from: " +
                    orderRequest.getOrderDate() + " was dispatched.");
        }
}
