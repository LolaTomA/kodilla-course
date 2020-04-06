package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;

    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }

    public String sharePost() {
        return  publisher.share();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User " + name + '.';
    }
}
