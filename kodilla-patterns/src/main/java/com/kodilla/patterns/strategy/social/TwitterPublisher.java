package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        String message = "Twitter";
        System.out.println(message);
        return message;
    }
}
