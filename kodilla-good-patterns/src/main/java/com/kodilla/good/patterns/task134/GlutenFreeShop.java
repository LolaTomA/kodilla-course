package com.kodilla.good.patterns.task134;

public class GlutenFreeShop extends Producer {

    public GlutenFreeShop() {
        super("GlutenFreeShop ", "Tropy 7 ");
    }

    @Override
    public boolean process(Product product) {
        if(product.getQuantity() >= 1) {
            System.out.println("GlutenFreeShop welcomes You. ");
            return true;
        } else {
            System.out.println("You have not ordered anything. ");
            return false;
        }
    }
}
