package com.kodilla.good.patterns.task134;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    final Map<String, Product> products = new HashMap<>();

    Product product1 = new Product(new ExtraFoodShop(), "eggs size L", 24);
    Product product2 = new Product(new GlutenFreeShop(), "corn bread", 4);
    Product product3 = new Product(new HealthyShop(), "Veg sup", 5);


    public void addProduct(){

        products.put(product1.getProducer().toString(), product1);
        products.put(product2.getProducer().toString(), product2);
        products.put(product3.getProducer().toString(), product3);
    }

    public HashMap<String, Product> getProducts() {
        return new HashMap<>(products);
    }
}

