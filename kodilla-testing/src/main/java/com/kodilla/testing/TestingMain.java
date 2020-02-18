package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        int result = calculate.addAToB(8,3);
        if (result == 11){
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }
        result = calculate.subtractBFromA(8,3);
        if (result == 5){
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }
    }
}