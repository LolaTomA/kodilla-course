package com.kodilla.good.patterns.task134;

public class Food2Door {

    public static void main(String[] args) {

        OrderRepository orderRepository = new OrderRepository();
        orderRepository.addProduct();
        OrderService orderService = new OrderService();
        orderService.processOrder(orderRepository);
    }
}