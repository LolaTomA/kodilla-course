package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        String message = "Snapchat";
        System.out.println(message);
        return message;
    }
}
