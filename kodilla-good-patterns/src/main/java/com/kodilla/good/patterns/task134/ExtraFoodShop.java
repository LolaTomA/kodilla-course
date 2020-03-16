package com.kodilla.good.patterns.task134;

public class ExtraFoodShop extends Producer {

    public ExtraFoodShop() {
        super("ExtraFoodShop ", "Kowale 10 ");
    }

    Product product;
    int quantity = product.getQuantity();

    @Override
    public boolean process() {
        if(quantity % 6 == 0){
            System.out.println("Always fresh eggs. Thank you for order");
            return true;
        }
        System.out.println("Sorry! Your order\'s quantity must be multiple 6.");
        return false;
    }
}
