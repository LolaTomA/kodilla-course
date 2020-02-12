package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);

        if (sum == 8) {
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }

        int calcsubt = calculator.subtract(5, 3);

        if (calcsubt == 2) {
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }
    }
}
