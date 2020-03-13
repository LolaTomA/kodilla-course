package com.kodilla.good.patterns.challenges;


public class OrderService {
    public boolean order(OrderRequest orderRequest){
        System.out.println("Get " + orderRequest.getProduct() + " from warehouse to goods carrier");
        return true;
    }
}
