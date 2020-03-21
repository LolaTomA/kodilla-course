package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class JohnSmith extends WriteText {
    @Override
    public String doWrite() {
        System.out.println("John Smith");
        return "John Smith";
    }
}
