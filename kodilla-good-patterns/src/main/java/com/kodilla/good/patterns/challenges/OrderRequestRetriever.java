package com.kodilla.good.patterns.challenges;


public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        OrderRepository orderRepository = new OrderRepository();

        OrderRequest orderRequest = orderRepository.createOrder();

        System.out.println( orderRequest.getUser() + " ordered: " + orderRequest.getProduct());

     return orderRequest;
    }

}
