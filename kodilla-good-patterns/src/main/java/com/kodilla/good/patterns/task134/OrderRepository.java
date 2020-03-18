package com.kodilla.good.patterns.task134;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    final Map<Producer, Product> products = new HashMap<>();

    Product product1 = new Product( "eggs size L", 24);
    Product product2 = new Product( "corn bread", 4);
    Product product3 = new Product( "Veg sup", 5);


    public void addProduct(){
        products.put(new ExtraFoodShop(), product1);
        products.put(new GlutenFreeShop(), product2);
        products.put(new HealthyShop(), product3);
    }

    public HashMap<Producer, Product> getProducts() {
        return new HashMap<>(products);
    }
}

