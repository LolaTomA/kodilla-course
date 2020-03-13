package com.kodilla.good.patterns.challenges;

public class InformationService {

    public void inform(User user) {
        user = OrderRequest.getUser();
        System.out.println("Dear " + user.toString() + ", your order from: " +  "");

    }
}
