package com.kodilla.good.patterns.task134;

public class HealthyShop extends Producer{

    public HealthyShop() {
        super("HealthyShop", "Nowakowo 5 ");
    }

    Product product;
    int quantity = product.getQuantity();

    @Override
    public boolean process() {
        if(quantity >= 1 && quantity <= 10){
            System.out.println("Enjoy your meal, HealthyShop best food! ");
            return true;
        }

        System.out.println("Sorry, we can\'t sell you so many meals, please try to order no more than 10" +
                " HealthyShop best food! ");
        return false;
    }
}
