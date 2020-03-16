package com.kodilla.good.patterns.task134;

public class GlutenFreeShop extends Producer {

    public GlutenFreeShop() {
        super("GlutenFreeShop ", "Tropy 7 ");
    }

    Product product;
    int quantity = product.getQuantity();

    @Override
    public boolean process() {
        if(quantity >= 1){
            System.out.println("GlutenFreeShop welcomes You. ");
            return true;
        }

System.out.println("You have not ordered anything. ");
        return false;
    }
}
