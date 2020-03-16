package com.kodilla.good.patterns.task134;

public class OrderService {

    public void processOrder(OrderRepository orderRepository){

        orderRepository.getProducts().entrySet().forEach(product-> {
            System.out.println("Ordering product: " + product.getValue().getProductName() + ": " +
                "quantity: " + product.getValue().getQuantity() + "from: " +
                product.getValue().getProducer().getProducerName());

            boolean status = false;
            status = product.getValue().getProducer().process();

            if(status){
                System.out.println("Order status OK! ");
            }

            System.out.println("Order status Not OK! ");
        });
    }
}
